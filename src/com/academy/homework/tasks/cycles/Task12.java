package com.academy.homework.tasks.cycles;

public class Task12 {

//  12. Найти произведение двузначных нечетных чисел кратных 13.

  public static void main(String[] args) {
    int num = 1;

    for (int i = 10; i < 100; i++) {
      if (i % 2 != 0 && i % 13 == 0) {
        num *= i;
      }

    }
    System.out.println(num);
  }

}
