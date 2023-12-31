package optionals.chapter3

import spock.lang.Shared
import spock.lang.Specification

class CheckingValuePresenceSpec extends Specification {

  @Shared
    instance = new CheckingValuePresence()

  def "when is present"() {
    given:
    boolean response
    when:
    response = instance.whenIsPresentWithAValue()
    then:
    response
  }

  def "when is present with a null"() {
    given:
    boolean response
    when:
    response = instance.whenIsPresentWithANull()
    then:
    !response
  }

  def "when is empty with a value"() {
    given:
    boolean response
    when:
    response = instance.whenIsEmptyWithAValue()
    then:
    !response
  }

  def "when is empty with a null"() {
    given:
    boolean response
    when:
    response = instance.whenIsEmptyWithANull()
    then:
    response
  }

}
