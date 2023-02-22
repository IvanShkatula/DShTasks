package com.academy.homework.nested_classes.body;

/*1. Создать класс Body.
    2. Создать внутренний класс Heart, объект которого создается в конструкторе Body.
    Реализовать метод beat (в классе Heart), при вызове которого вы выводите на экран “ Knock-knock-knock”, и каждый  100 вызов метода
    выводите на экран "Knock-knock-knockin' on heaven's door". (Нужно добавить счетчик в класс Heart)
    3. Создать внутренний класс Lungs, объект которого создается в конструкторе Body.
      В классе Lungs реализовать метод breathIn и метод breathOut , в которых вы выводите на экран “Breath in!” и Breath out!”
      соответственно.
    4. Реализовать метод live в классе Body,
    в котором мы пробегаемся от минимального Integer до максимального и на каждой 3 итерации вызываем метод breathIn,
    а спустя 2 итерации вызываете breathOut на объекте класса Lungs.
    Каждую 2 итерацию вызываем метод beat на объекте класса Heart.
    После отработки цикла выведем на экран:
    "You stand on the shore and feel the salty smell of the wind that blows from the sea.
    And I believe that you are free, and life has only begun.".*/

public class Body {

  Heart heart;
  Lungs lungs;

  public Body() {
    heart = new Heart();
    lungs = new Lungs();
  }


  public void live() {
    int countLungs = 0;
    for (int i = Integer.MIN_VALUE; i < Integer.MAX_VALUE; i++) {
      if (i % 2 == 0) {
        heart.beat();
      }
      if (countLungs == 3) {
        lungs.breathIn();
      } else if (countLungs == 5) {
        lungs.breathOut();
        countLungs = 0;
      }
      countLungs++;
    }
    System.out.println("You stand on the shore and feel the salty smell of the wind that blows from the sea.\n" +
        "And I believe that you are free, and life has only begun.");
  }

  public class Heart {
    int count = 0;

    public void beat() {
      if (count == 100) {
        System.out.println("Knock-knock-knockin' on heaven's door");
        count = 0;
      } else {
        System.out.println("Knock-knock-knock");
        count++;
      }
    }
  }

  public class Lungs {
    public void breathIn() {
      System.out.println("Breath in!");
    }

    public void breathOut() {
      System.out.println("Breath out!");
    }
  }

  public static void main(String[] args) {
    new Body().live();
  }

}
