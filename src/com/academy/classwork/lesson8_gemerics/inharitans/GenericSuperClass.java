package com.academy.classwork.lesson8_gemerics.inharitans;

public class GenericSuperClass<T> {
  private T object;

  public GenericSuperClass() {
  }
  public GenericSuperClass(T object) {
    this.object = object;
  }

  public T getObject() {
    return object;
  }

  public void setObject(T object) {
    this.object = object;
  }
}
