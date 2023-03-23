package com.academy.classwork.lesson8_gemerics.inharitans;

public class GenericConstructor {
  private Double value;

  public <T extends Number> GenericConstructor(T x) {
    this.value = x.doubleValue();
  }
}
