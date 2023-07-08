package optionals.chapter3;

import java.util.Optional;

public class CheckingValuePresence {

  public boolean whenIsPresent() {
    Optional<String> optiona = Optional.of("string");
    return optiona.isPresent();
  }

}

