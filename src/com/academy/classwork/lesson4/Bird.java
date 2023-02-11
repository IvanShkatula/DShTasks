package com.academy.classwork.lesson4;

public class Bird implements Flyable, Walkable{
  @Override
  public void flyLikeSuperman() {
    Flyable.super.flyLikeSuperman();
    Walkable.super.flyLikeSuperman();
  }

  @Override
  public void fly() {
    System.out.println("bird fly");
  }

  @Override
  public void walk() {
    System.out.println("bird walk");
  }

  @Override
  public String toString() {
    return "Bird{}";
  }
}
