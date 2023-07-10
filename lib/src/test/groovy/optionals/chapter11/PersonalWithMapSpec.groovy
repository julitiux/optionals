package optionals.chapter11

import spock.lang.Shared
import spock.lang.Specification

class PersonalWithMapSpec extends Specification {

  @Shared
    instance = new PersonalWithMap()

  def "when FlatMap Is Not Here"() {
    when:
    String response = instance.whenFlatMapIsNotHere(_Person)
    then:
    response == _response
    where:
    _Person                                           | _response
    Optional.of(new Person("Julito", 10, "password")) | "Julito"
  }


  def "when FlatMap Is Here"() {
    when:
    String response = instance.whenFlatMapIsHere(_Person)
    then:
    response == _response
    where:
    _Person                                           | _response
    Optional.of(new Person("Julito", 10, "password")) | "Julito"
  }
}