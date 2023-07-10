package optionals.chapter13;

import java.util.Optional;

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

}
