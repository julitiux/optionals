package optionals.chapter11;

import java.util.Optional;

public class Person {

  String name;
  int age;
  String password;

  public Optional<String> getName() {
    return Optional.ofNullable(name);
  }

  public Optional<Integer> getAge() {
    return Optional.ofNullable(age);
  }

  public Optional<String> getPassword() {
    return Optional.ofNullable(password);
  }

  public void setName(String name) {
    this.name = name;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public void setPassword(String password) {
    this.password = password;
  }
}
