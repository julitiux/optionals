package optionals.chapter13;

import java.util.Optional;
import java.util.stream.Stream;

public class ChainingOptionals {

  private static Optional<String> getEmpty() {
    return Optional.empty();
  }

  private static Optional<String> getHello() {
    return Optional.of("hello");
  }

  private static Optional<String> getBye() {
    return Optional.of("bye");
  }

  private static Optional<String> createOptional(String input) {
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
