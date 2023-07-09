package optionals.chapter7

import spock.lang.Shared
import spock.lang.Specification

class DifferenceBetweenOrElseandElseGetSpec extends Specification {

  @Shared
    instance = new DifferenceBetweenOrElseandElseGet()

  def "using orElseGet"() {
    expect:
    instance.orElseGet()
  }

  def "using orElse"() {
    expect:
    instance.orElse()
  }

}
