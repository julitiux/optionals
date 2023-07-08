package optionals.chapter3;

import java.util.Optional;

public class CheckingValuePresence {

  public boolean whenIsPresentWithAValue() {
    Optional<String> optional = Optional.of("string");
    return optional.isPresent();
  }

  public boolean whenIsPresentWithANull() {
    Optional<String> optional = Optional.ofNullable(null);
    return optional.isPresent();
  }

  public boolean whenIsEmptyWithAValue() {
    Optional<String> optional = Optional.of("string");
    return optional.isEmpty();
  }

}

