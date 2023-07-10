package optionals.chapter13;

import java.util.Optional;
import java.util.stream.Stream;

public class ChainingOptionals {

  public Optional<String> getEmpty() {
    return Optional.empty();
  }

  public Optional<String> getHello() {
    return Optional.of("hello");
  }

  public Optional<String> getBye() {
    return Optional.of("bye");
  }

  public Optional<String> createOptional(String input) {
    if (input == null || "".equals(input) || "empty".equals(input))
      return Optional.empty();
    return Optional.of(input);
  }

  public Optional<String> chainingFirstNonEmptyIsReturned() {
    return Stream.of(getEmpty(), getHello(), getBye())
      .filter(Optional::isPresent)
      .map(Optional::get)
      .findFirst();
  }

}
