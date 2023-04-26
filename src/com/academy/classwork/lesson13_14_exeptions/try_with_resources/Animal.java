package com.academy.classwork.lesson13_14_exeptions.try_with_resources;

public abstract class Animal {
  public Animal() throws Exception {

  }

  public Animal(int i) {

  }

  public void start () throws Exception{
    System.out.println("start");
  }

  public abstract void stop() throws Exception;
}
