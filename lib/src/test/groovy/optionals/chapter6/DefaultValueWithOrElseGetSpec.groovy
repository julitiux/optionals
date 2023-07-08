package optionals.chapter6

import spock.lang.Shared
import spock.lang.Specification

class DefaultValueWithOrElseGetSpec extends Specification {

  @Shared
    instance = new DefaultValueWithOrElseGet()

  def "orElseGet Works"() {
    expect:
    instance.orElseGetWorks();
  }

}
