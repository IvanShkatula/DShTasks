package com.academy.homework.tasks.arrays;

public class Task10 {

  /*Задача 10.
  Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на экран в строку.
  Определите какой элемент встречается в массиве чаще всего и выведите об этом сообщение на экран.
  Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.*/

  public static void main(String[] args) {

    int[] random11Array = new int[11];
    int minusOne = 0;
    int one = 0;
    int plusOne = 0;

    for (int i = 0; i < random11Array.length; i++) {
      random11Array[i] = (int) ((Math.random() * 4) - 2);
//      как работает масс рандом, почему нельзя 2: -1
    }

    for (int num : random11Array) {
      if (num == 1) {
        plusOne++;
      } else if (num == 0) {
        one++;
      } else {
        minusOne++;
      }
      System.out.println(num);
    }

    if (minusOne > one && minusOne > plusOne) {
      System.out.println(minusOne);
    } else if (one > minusOne && one > plusOne) {
      System.out.println(one);
    } else if (plusOne > one && plusOne > minusOne) {
      System.out.println(plusOne);
    } else {
      System.out.println(00000000);
    }


  }
}
