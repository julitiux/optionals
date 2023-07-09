package optionals.chapter7;

import java.util.Optional;

public class DifferenceBetweenOrElseandElseGet {

  public static String getMyDefault() {
    System.out.println("Getting Default Value");
    return "Default Value";
  }

  public void orElseGet() {
    String string = null;
    String defaultString = Optional.ofNullable(string).orElseGet(DifferenceBetweenOrElseandElseGet::getMyDefault);
    System.out.println(defaultString);
  }

  public void orElse() {
    String string = null;
    String defaultString = Optional.ofNullable(string).orElse(getMyDefault());
    System.out.println(defaultString);
  }

}
