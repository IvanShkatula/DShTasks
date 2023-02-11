package com.academy.homework.classes.task8;


public class Veterinar {

  public void treatAnimal(Animals animal) {
    System.out.println(animal.getClass().getSimpleName() + " " + animal.location + " " + animal.food);
  }
}
