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

}
