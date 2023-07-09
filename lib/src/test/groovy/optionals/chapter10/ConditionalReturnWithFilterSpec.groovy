package optionals.chapter10

import spock.lang.Shared
import spock.lang.Specification

class ConditionalReturnWithFilterSpec extends Specification {

  @Shared
    instance = new ConditionalReturnWithFilter()

  def "optional Filter Works"() {
    when:
    def response = instance.optionalFilterWorks()
    then:
    response
  }
}
