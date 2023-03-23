package com.academy.classwork.lesson9_collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListspreobrazovanie {

  public static void main(String[] args) {
    LinkedList<Integer> linkedList = new LinkedList<>();
    ArrayList<Integer> arrayList = new ArrayList<>(linkedList);

  }
}
