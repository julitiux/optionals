package optionals.chapter6;

import java.util.Optional;

public class DefaultValueWithOrElseGet {

  public String orElseGetWorks() {
    String nullName = null;
    String name = Optional.ofNullable(nullName).orElseGet(() -> "the name");
    return name;
  }

}
