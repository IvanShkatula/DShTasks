package com.academy.homework.classes.task8;

public class Dog extends Animals{

  String specificDog;

  public Dog(String food, String location, String specificDog) {
    super(food, location);
    this.specificDog = specificDog;
  }

  protected void makeNoise(){
    System.out.println("Гав");
  }
  protected void eat() {
    System.out.println("Собака ест");
  }
  protected void sleep(){
    System.out.println("Собака спит");
  }
}
