package com.academy.homework.recursion;

public class Task1 {

  /*Задача: напишите рекурсивную функцию для вычисления суммы заданных положительных целых чисел a и b без прямого
  использования оператора +.*/

  public static void main(String[] args) {
    System.out.println(sumAB(2, 2));
  }

  private static int sumAB(int a, int b) {
    if (b == 0) {
      return a;
    }
    return sumAB(a + 1, b - 1);
  }

}
