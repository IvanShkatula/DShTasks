package com.academy.classwork.lesson8_gemerics.inharitans;

import com.academy.classwork.lesson4.Cat;

public class GenericClassDemo {
  public static void main(String[] args) {
    GenericSub<Integer, Double, String> genericSub = new GenericSub<>();
    GenericSub<Cat, Cat, Cat> genericSubUnic = new GenericSub<>();
    GenericSub2<String> genericSub2 = new GenericSub2<>();
    genericSubUnic.getObject();
    genericSub2.getObject();

    GenericConstructor genericConstructor = new GenericConstructor(2L);
  }
}
