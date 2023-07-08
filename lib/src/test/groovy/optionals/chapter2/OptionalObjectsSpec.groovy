package optionals.chapter2

import spock.lang.Shared
import spock.lang.Specification

class OptionalObjectsSpec extends Specification {

  @Shared
    instance = new OptionalObjects()

  def "create a empty optional"() {
    given:
    Optional<String> response
    when:
    response = instance.createAEmptyOptional()
    then:
    response.isEmpty()
  }

  def "create non nullable"() {
    given:
    Optional<String> response
    when:
    response = instance.createNonNullable()
    then:
    response.present
  }

  def "throw error on create"() {
    given:
    Optional<String> response
    when:
    response = instance.throwErrorOnCreate()
    then:
    thrown(NullPointerException)
  }

}
