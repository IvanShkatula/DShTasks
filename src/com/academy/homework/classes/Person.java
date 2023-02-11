package com.academy.homework.classes;

public class Person {

/*
  2.	Создать класс Person, который содержит:
  a) поля fullName, age.
  б) методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит".
  в) Добавьте два конструктора  - Person() и Person(fullName, age).
  Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).
*/

  private String fullName;
  int age;

  public Person() {
    super();
  }

  public Person(String fullName, int age) {
    this.fullName = fullName;
    this.age = age;
  }

  public static void main(String[] args) {
    Person person = new Person();
    Person person1 = new Person("Ivan", 33);
  }

  private void move() {
    System.out.println(fullName + " идет");
  }

  private void talk() {
    System.out.println(fullName + " говорит");
  }


}
