package com.academy.classwork.lesson13_14_exeptions;

public class ClassCastExceptionExample {

  public static void main(String[] args) {
//    Object i = 5;
//    String s = (String) i;
//    System.out.println(s);

    Cat cat = new Cat();
    Animal animal = new Animal();


    cat = (Cat) animal;
  }
}
