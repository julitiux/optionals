package optionals;

import java.util.Optional;

public class ConditionalActionWithIfPresent {

  public void withIfPresentWorks() {
    Optional<String> optional = Optional.of("string");
    optional.ifPresent(string -> System.out.println(string.length()));
  }

}
