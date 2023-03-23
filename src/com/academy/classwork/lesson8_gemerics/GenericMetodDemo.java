package com.academy.classwork.lesson8_gemerics;

public class GenericMetodDemo {

  public static void main(String[] args) {

    Integer[] arrayInt = {1, 2, 3, 4, 5};
    String[] arrayString = {"one", "two", "three"};

    if (isIn(2, arrayInt)) {
      System.out.println("2 входит в массив Интеджеров");
    }

    if (isIn("two", arrayString)) {
      System.out.println("2 входит в массив Стрингов");
    }

  }

  public static <T, V> boolean isIn(T x, V[] array) {

    if (x == null) {
      return false;
    }

    for (V element : array) {
      if (x.equals(element)) {
        return true;
      }
    }
    return false;
  }

}
