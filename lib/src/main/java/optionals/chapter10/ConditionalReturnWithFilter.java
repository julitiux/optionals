package optionals.chapter10;

import java.util.Optional;

public class ConditionalReturnWithFilter {

  public boolean optionalFilterWorks() {
    Integer year = 2018;
    Optional<Integer> yearOptional = Optional.of(year);
    return yearOptional.filter(y -> y == 2018).isPresent();
  }

  public boolean optionalFilterNotWorks() {
    Integer year = 2022;
    Optional<Integer> yearOptional = Optional.of(year);
    return yearOptional.filter(y -> y == 2018).isPresent();
  }

  public boolean priceIsInRange(Modem modem) {
    boolean isInRange = false;

    if (modem != null && modem.getPrice() != null && (modem.getPrice() >= 10 && modem.getPrice() <= 15)){
      isInRange = true;
    }
    return isInRange;
  }

}
