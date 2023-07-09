package optionals.chapter11

import spock.lang.Shared
import spock.lang.Specification

class TransformingValuesWithMapSpec extends Specification {

  @Shared
    instance = new TransformingValuesWithMap()

  def "map Works Count Elements Of List"() {
    when:
    Integer response = instance.mapWorksCountElementsOfList()
    then:
    response == 6
  }

}
