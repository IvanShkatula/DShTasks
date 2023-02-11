package com.academy.homework.classes.task8;

public class Application {
  public static void main(String[] args) {
    Animals[] animals = new Animals[3];
    Veterinar veterinar = new Veterinar();
    Animals cat = new Cat("foodCat", "locationCat", "specificCat");
    Animals dog = new Dog("foodDog", "locationDog", "specificDog");
    Animals horse = new Horse("foodHorse", "locationHorse", 123);

    animals[0] = cat;
    animals[1] = dog;
    animals[2] = horse;

    for (int i = 0; i < animals.length; i++) {
      veterinar.treatAnimal(animals[i]);
    }
  }
}
