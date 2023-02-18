package com.academy.homework.recursion;

public class Task2 {

//  Задача: напишите функцию без итерационного оператора для поиска максимального значения в массиве целых чисел.

  public static void main(String[] args) {
    int[] a = new int[]{10, 5, 7, 1, 8, 2};
    System.out.println(findMax(a, 0));
  }

  private static int findMax(int[] array, int i) {
// как не передавать i, т.к. оно всегда должно быть равно 0?
    if (i == array.length) {
      return array[0];
    }
    return Math.max(array[i], findMax(array, i + 1));

  }

}
