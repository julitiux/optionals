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

  def "optional Filter NOT Works"() {
    when:
    def response = instance.optionalFilterNotWorks()
    then:
    !response
  }

  def "price Is InRange whitout Optional"() {
    given:
    Modem modem = _modem
    def respponse
    when:
    respponse = instance.priceIsInRange(modem)
    then:
    respponse == _responde
    where:
    _modem          | _responde
    new Modem(10.0) | true
    new Modem(9.9)  | false
    new Modem(null) | false
    new Modem(15.5) | false
    null            | false
  }

  def "price Is In Range With Optional function"() {
    given:
    Modem modem = _modem
    def respponse
    when:
    respponse = instance.priceIsInRangeWithOptional(modem)
    then:
    respponse == _responde
    where:
    _modem          | _responde
    new Modem(10.0) | true
    new Modem(9.9)  | false
    new Modem(null) | false
    new Modem(15.5) | false
    null            | false
  }


}
