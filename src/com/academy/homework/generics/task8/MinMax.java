package com.academy.homework.generics.task8;

public class MinMax <T extends Number>{
  
  private T[] arrayT;

  public MinMax(T[] arrayT) {
    this.arrayT = arrayT;
  }

  public double min() {
    if (arrayT == null || arrayT.length == 0) {
      throw new RuntimeException();
    }
    double min = arrayT[0].doubleValue();
    for (int i = 1; i < arrayT.length; i++) {
      if (min > arrayT[i].doubleValue()) {
        min = arrayT[i].doubleValue();
      }
    }
    return min;
  }

  public double average() {
    if (arrayT == null || arrayT.length == 0) {
      throw new RuntimeException();
    }
    double count = 0;
    for (int i = 0; i < arrayT.length; i++) {
      count += arrayT[i].doubleValue();
    }
    return count / arrayT.length;
  }
}
