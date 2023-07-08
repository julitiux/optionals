package optionals.chapter5;

import java.util.Optional;

public class DefaultValueWithOrElse {

  public String orElseWorks() {
    String nullName = null;
    String name = Optional.ofNullable(nullName).orElse("other string");
    return name;
  }

}
