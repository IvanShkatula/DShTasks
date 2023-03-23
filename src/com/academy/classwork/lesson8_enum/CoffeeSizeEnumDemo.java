package com.academy.classwork.lesson8_enum;

public class CoffeeSizeEnumDemo {
  public static void main(String[] args) {
    String size = CoffeeSize.BIG;
    CoffeeSizeEnum enumSize = CoffeeSizeEnum.BIG;
//    System.out.println(enumSize == CoffeeSizeEnum.BIG);
//
//
//    System.out.println(CoffeeSizeEnum.valueOf("BIG") == enumSize);
//
//    for (CoffeeSizeEnum enum2: CoffeeSizeEnum.values()) {
//      System.out.println(enum2);
//      System.out.println(enum2.name());
//      System.out.println(enum2.ordinal());
//    }
//    switch (enumSize) {
//      case BIG -> System.out.println("");
//
//    }

    enumSize.test();
  }
}
