package optionals.chapter9;

import java.util.Optional;

public class ReturningValueWithGet {

  public Optional<String> getsValue() {
    return Optional.of("string");
  }

}
