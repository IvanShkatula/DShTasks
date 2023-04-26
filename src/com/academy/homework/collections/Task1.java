package com.academy.homework.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
Задача 1.
    Можно писать все в main. Не нужно создавать новых классов.
    Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.
*/


public class Task1 {
  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    Integer a = 1;
    Integer b = 1;
    Integer c = 2;
    Integer d = 2;
    arrayList.add(a);
    arrayList.add(b);
    arrayList.add(c);
    arrayList.add(d);


    System.out.println(returnSet(arrayList));
  }

  private static <T> Set returnSet(Collection<T> collection) {
    return new HashSet(collection);
  }
}
