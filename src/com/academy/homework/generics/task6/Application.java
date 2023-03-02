package com.academy.homework.generics.task6;

public class Application {

  public static void main(String[] args) {
    AnimalTest animalTest = new AnimalTest();
    NumbersTest numbersTest = new NumbersTest();
    StringTest stringTest = new StringTest();

    Task6TVK<AnimalTest, NumbersTest, StringTest> task6TVK = new Task6TVK<>(animalTest, numbersTest, stringTest);

    //Task6TVKWithRestrictions<AnimalTest, NumbersTest, StringTest> task6TVKWithRestrictions = new Task6TVKWithRestrictions<>(animalTest, numbersTest, stringTest);

    task6TVK.printClasses();
  }

}
