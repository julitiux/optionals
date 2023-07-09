package optionals.chapter10;

import java.util.Optional;

public class ConditionalReturnWithFilter {

  public boolean optionalFilterWorks() {
    Integer year = 2018;
    Optional<Integer> yearOptional = Optional.of(year);
    return yearOptional.filter(y -> y == 2018).isPresent();
  }

}
