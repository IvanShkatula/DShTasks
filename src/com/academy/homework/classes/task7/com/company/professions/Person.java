package com.academy.homework.classes.task7.com.company.professions;

public class Person extends Driver{

  private String fullName;

  public Person(String fIO, int drivingAge, String fullName) {
    super(fIO, drivingAge);
    this.fullName = fullName;
  }

  @Override
  public String toString() {
    return "Person{" +
        "fullName='" + fullName + '\'' +
        '}';
  }
}
