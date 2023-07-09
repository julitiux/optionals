package optionals.chapter11;

import java.util.List;
import java.util.Optional;

public class TransformingValuesWithMap {

  public Integer mapWorksCountElementsOfList(List<String> list) {
    Optional<List<String>> optionalList = Optional.of(list);
    return optionalList.map(List::size).orElse(0);
  }

  public boolean mapWorkWithFilter(String password, String correctPassword) {
    return Optional.ofNullable(password)
      .map(String::trim)
      .filter(pass -> pass.equals(correctPassword))
      .isPresent();
  }

}
