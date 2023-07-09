package optionals.chapter9

import spock.lang.Shared
import spock.lang.Specification

class ReturningValueWithGetSpec extends Specification {

  @Shared
    instance = new ReturningValueWithGet()

  def "get Value"() {
    when:
    Optional<String> response = instance.getsValue()
    then:
    response.get().equals('string')
    response.isPresent()
  }
}
