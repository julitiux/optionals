package optionals.chapter11;

import java.util.Optional;

public class PersonalWithMap {

  public String whenFlatMapIsNotHere(Optional<Person> optionalPerson) {
    Optional<Optional<String>> nameOptionalWrapper = optionalPerson.map(Person::getName);
    Optional<String> nameOptional = nameOptionalWrapper.orElseThrow(IllegalArgumentException::new);
    return nameOptional.orElse("");
  }

  public String whenFlatMapIsHere(Optional<Person> optionalPerson) {
    return optionalPerson
      .flatMap(Person::getName)
      .orElse("");
  }

}
