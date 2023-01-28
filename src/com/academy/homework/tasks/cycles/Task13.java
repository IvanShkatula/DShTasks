package com.academy.homework.tasks.cycles;

public class Task13 {

//  13. Найти сумму чисел от 100 до 200 кратных 17.

  public static void main(String[] args) {
    int num = 0;

    for (int i = 100; i < 201; i++) {
      if (i % 17 == 0) {
        num += i;
      }
    }

    System.out.println(num);
  }
}
