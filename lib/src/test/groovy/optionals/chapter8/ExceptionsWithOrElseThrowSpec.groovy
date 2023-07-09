package optionals.chapter8

import spock.lang.Shared
import spock.lang.Specification

class ExceptionsWithOrElseThrowSpec extends Specification {

  @Shared
    instance = new ExceptionsWithOrElseThrow()

  def "orElseThrow Works"() {
    when:
    instance.orElseThrowWorks()
    then:
    thrown(NullPointerException)
  }

  def "orElseThrow Simple"() {
    when:
    instance.orElseThrowSimple()
    then:
    thrown(NoSuchElementException)
  }
}
