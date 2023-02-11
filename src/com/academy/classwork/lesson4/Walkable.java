package com.academy.classwork.lesson4;

public interface Walkable {

  public void walk();

  default void flyLikeSuperman() {
    System.out.println("fly like superman from walkable");
  }
}
