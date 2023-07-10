package optionals.chapter13

import spock.lang.Shared
import spock.lang.Specification

class ChainingOptionalsSpec extends Specification {

  @Shared
    instance = new ChainingOptionals()


  def "chaining First Non Empty Is Returned"() {
    when:
    def response = instance.chainingFirstNonEmptyIsReturned()
    then:
    response == _response
    where:
    _response << instance.getHello()
  }

  def "chaining First Not Empty Is Returned And Rest Not Evaluated"() {
    when:
    def response = instance.chainingFirstNotEmptyIsReturnedAndRestNotEvaluated()
    then:
    response == _response
    where:
    _response << instance.getHello()
  }

}
