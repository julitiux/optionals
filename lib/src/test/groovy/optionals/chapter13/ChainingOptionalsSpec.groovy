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

  def "chaining First Non Empty Is Return If Has A One Argument"() {
    when:
    def response = instance.chainingFirstNonEmptyIsReturnIfHasAOneArgument()
    then:
    response == _response
    where:
    _response << instance.createOptional("hello")
  }

  def "chaining Default Is Returned"() {
    when:
    String response = instance.chainingDefaultIsReturned()
    then:
    response.equals("default")
  }

}
