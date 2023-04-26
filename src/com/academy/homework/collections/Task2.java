package com.academy.homework.collections;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Task2 {


/*
  Задача 2.
  Можно писать все в main. Не нужно создавать новых классов.
  Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList.
  Напишите еще один метод, который выбирает из заполненного списка элемент наугад 100000 раз.
  Замерьте время, которое потрачено на это.
  Сравните результаты и предположите, почему они именно такие.
*/


  public static void main(String[] args) {

    ArrayList<Integer> integerArrayList = new ArrayList<>();
    LinkedList<Integer> integerLinkedList = new LinkedList<>();

    for (int i = 0; i < 1000000; i++) {
      integerArrayList.add(i);
      integerLinkedList.add(i);
    }
    long start = System.currentTimeMillis();
    for (int i = 0; i < 1000000; i++) {
      integerArrayList.get((int) (Math.random()*1000000));
    }
    long finish = System.currentTimeMillis();
    System.out.println((finish - start));

    long startL = System.currentTimeMillis();
    for (int i = 0; i < 1000000; i++) {
      integerLinkedList.get((int) (Math.random()*1000000));
    }
    long finishL = System.currentTimeMillis();
    System.out.println((finishL - startL));

  }

}
