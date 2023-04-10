package com.academy.classwork.lesson12_map_iterator;

import java.util.Iterator;

public class ArrayIteratoDemo {

  public static void main(String[] args) {
    String[] strings = {"a", "b", "c", "e", "d", "w"};
//    ArrayIterator<String> arrayIterator = new ArrayIterator<>(strings);
//    while (arrayIterator.hasNext()) {
//      //   System.out.println(arrayIterator.next());
//      //  String s = arrayIterator.next();
//      if (arrayIterator.next().equals("b")) {
//        arrayIterator.remove();
//      }
//    }
//
//    ArrayIterator<String> arrayIterator1 = new ArrayIterator<>(strings);
//    while (arrayIterator1.hasNext()) {
//      System.out.println(arrayIterator1.next());
//    }


    Box<String> stringBox = new Box<>(strings);
    Iterator<String> stringIterator = stringBox.iterator();
    while (stringIterator.hasNext()) {
      System.out.println(stringIterator.next());
    }

    for (String s : stringBox) {
      System.out.println(s);
    }
  }
}
