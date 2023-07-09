package optionals.chapter11;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TransformingValuesWithMap {

  public Integer mapWorksCountElementsOfList() {
    List<String> list = Arrays.asList("paypal", "oracle", "", "microsoft", "", "apple");
    Optional<List<String>> optionalList = Optional.of(list);
    return optionalList.map(List::size).orElse(0);
  }

}
