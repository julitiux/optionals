package optionals.chapter5

import spock.lang.Shared
import spock.lang.Specification

class DefaultValueWithOrElseSpec extends Specification {

  @Shared
    instance = new DefaultValueWithOrElse()

  def "orElse Works"() {
    expect:
    instance.orElseWorks()
  }

}
