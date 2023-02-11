package com.academy.homework.classes.task8;

public class Horse extends Animals{

  int specificHorse;

  public Horse(String food, String location, int specificHorse) {
    super(food, location);
    this.specificHorse = specificHorse;
  }

  protected void makeNoise(){
    System.out.println("Иго-го");
  }
  protected void eat() {
    System.out.println("Лошадь ест");
  }
  protected void sleep(){
    System.out.println("Лошадь спит");
  }
}
