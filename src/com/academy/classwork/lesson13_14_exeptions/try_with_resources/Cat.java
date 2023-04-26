package com.academy.classwork.lesson13_14_exeptions.try_with_resources;

public class Cat extends Animal {
  public Cat() {
    super(5);
  }

  @Override
  public void start() {
    System.out.println("start cat");
  }

  @Override
  public void stop() {
    System.out.println("stop");
  }
}
