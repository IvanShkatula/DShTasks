package com.academy.homework.classes.task8;

public class Cat extends Animals{

  String specificCat;

  public Cat(String food, String location, String specificCat) {
    super(food, location);
    this.specificCat = specificCat;
  }

  protected void makeNoise(){
    System.out.println("Мяу");
  }
  protected void eat() {
    System.out.println("Кот ест");
  }
  protected void sleep(){
    System.out.println("кот спит");
  }
}
