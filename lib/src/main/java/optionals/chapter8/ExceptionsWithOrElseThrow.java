package optionals.chapter8;

import java.util.Optional;

public class ExceptionsWithOrElseThrow {

  public void orElseThrowWorks() {
    String nullName = null;
    Optional.ofNullable(nullName).orElseThrow(NullPointerException::new);
  }

  public void orElseThrowSimple() {
    String nullName = null;
    Optional.ofNullable(nullName).orElseThrow();
  }

}
