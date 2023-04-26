package com.academy.classwork.lesson9_collections_p;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2Lesson {

  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    List<Integer> newList = List.of(9, 10, 11);
    List<Integer> removeList = List.of(10, 15, 20);
    List<Integer> retainList = List.of(1, 999, 1000);

    arrayList.add(0);
    arrayList.add(1);
    arrayList.add(10);
    arrayList.add(3);
    arrayList.add(4);

    System.out.println(arrayList);

    arrayList.set(0, 999);

    System.out.println(arrayList);
    arrayList.addAll(4, newList);
    System.out.println(arrayList);

    arrayList.remove(Integer.valueOf(11));
    System.out.println(arrayList);

    arrayList.removeAll(removeList);
    System.out.println(arrayList);

    arrayList.retainAll(retainList);
    System.out.println(arrayList);

    arrayList.clear();
    System.out.println(arrayList);
  }

}
