package com.academy.homework.classes.task8;

public abstract class Animals {
  /*8.	Создать класс Animal и расширяющие его классы Dog, Cat, Horse. Класс Animal содержит переменные food,
    location и методы makeNoise, eat, sleep. Метод makeNoise, например, может выводить на консоль "Такое-то животное спит".
  Dog, Cat, Horse переопределяют методы makeNoise, eat.
  Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных.
  Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal).
  Пусть этот метод распечатывает food и location пришедшего на прием животного.
  В методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов.
  В цикле отправляйте их на прием к ветеринару.*/
  protected String food;
  protected String location;

  protected abstract void makeNoise();
  protected abstract void eat();
  protected abstract void sleep();

  public Animals(String food, String location) {
    this.food = food;
    this.location = location;
  }
}
