package com.academy.classwork.lesson7_generic;

import java.io.Serializable;

public class Box<T extends Number & Serializable, W, K> {

  private T[] items;
  private W positionalItem;
  private K oneMoreItem;
  @SuppressWarnings("unchecked")
  public Box() {
    items = (T[]) new Object[10];
  }
  public Box(T[] items) {
    this.items = items;
  }

  public T getItem(int index) {
    return items[index];
  }

  public double max() {
    if (items == null || items.length == 0) {
      throw new RuntimeException();
    }
    double max = items[0].doubleValue();
    for (int i = 1; i < items.length; i++) {
      if (max < items[i].doubleValue()) {
        max = items[i].doubleValue();
      }
    }
    return max;
  }

  public double min() {
    if (items == null || items.length == 0) {
      throw new RuntimeException();
    }
    double min = items[0].doubleValue();
    for (int i = 1; i < items.length; i++) {
      if (min > items[i].doubleValue()) {
        min = items[i].doubleValue();
      }
    }
    return min;
  }

  public double average() {
    if (items == null || items.length == 0) {
      throw new RuntimeException();
    }
    double count = 0;
    for (int i = 0; i < items.length; i++) {
      count += items[i].doubleValue();
    }
    return count / items.length;
  }

  //public boolean isSameAverage(Box<?> anotherBox) {
//    return average() == anotherBox.average();
//  }


  public T[] getItems() {
    return items;
  }

  public void setItems(T[] items) {
    this.items = items;
  }
}
