package com.academy.classwork.lesson4;

public interface Flyable {

  default void flyLikeSuperman() {
    System.out.println("fly like superman from flyable");
  }

  void fly();
}
