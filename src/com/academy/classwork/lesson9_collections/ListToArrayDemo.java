package com.academy.classwork.lesson9_collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ListToArrayDemo {

  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<>();

    arrayList.add(3);
    arrayList.add(5);
    arrayList.add(6);

    Integer[] array = arrayList.toArray(new Integer[0]);
    Object[] objectArrays = arrayList.toArray();
    Integer[] arrayInt = new Integer[arrayList.size()];
    arrayList.toArray(arrayInt);

    System.out.println(Arrays.toString(arrayInt));

    for (int i : array) {
      System.out.println(i);
    }
  }

}
