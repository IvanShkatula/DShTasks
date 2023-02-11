package com.academy.classwork.lesson4;

public class Cat extends Animal implements Walkable{
  {
    this.age = 3;
    System.out.println("I'm block");
    System.out.println(money);
  }

  public final int age;
  public static double money = 10.0;

  static {
    System.out.println("I'm static block");
    System.out.println(money);
  }

  public Cat() {
    System.out.println("I'm constructor");
  }

//  public Cat(int age) {
//    this.age = age;
//  }

  @Override
  protected void eat() {
    System.out.println("cat eat");
  }

  public static void sleep() {
    System.out.println();
  }

}
