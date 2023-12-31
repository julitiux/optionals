package optionals.chapter2;

import java.util.Optional;

public class OptionalObjects {

  public Optional<String> createAEmptyOptional() {
    Optional<String> empty = Optional.empty();
    return empty;
  }

  public Optional<String> createNonNullable() {
    String string = "optional";
    Optional optional = Optional.of(string);
    return optional;
  }

  public Optional<String> throwErrorOnCreate() {
    String string = null;
    Optional<String> optionalNull = Optional.of(string);
    return optionalNull;
  }

  public Optional<String> createNullable() {
    String string = "optional";
    Optional<String> optional = Optional.ofNullable(string);
    return optional;
  }

  public Optional<String> createNullableWithNull() {
    String string = null;
    Optional<String> optional = Optional.ofNullable(string);
    return optional;
  }


}

