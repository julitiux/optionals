package optionals.chapter11

import spock.lang.Shared
import spock.lang.Specification

class TransformingValuesWithMapSpec extends Specification {

  @Shared
    instance = new TransformingValuesWithMap()

  def "map Works Count Elements Of List"() {
    when:
    Integer response = instance.mapWorksCountElementsOfList(_list)
    then:
    response == _response
    where:
    _list                                              | _response
    ["paypal", "oracle", "", "microsoft", "", "apple"] | 6
    ["", "", "apple"]                                  | 3
    []                                                 | 0
  }

  def "map Work With Filter"() {
    when:
    boolean response = instance.mapWorkWithFilter(_password, _correctPassword)
    then:
    response == _response
    where:
    _password      | _correctPassword | _response
    "password"     | "password"       | true
    "  password  " | "password"       | true
    null           | "password"       | false
    "noPsassword"  | "password"       | false
    ""             | "password"       | false
  }

}
