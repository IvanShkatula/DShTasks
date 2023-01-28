package com.academy.homework.tasks.cycles;

public class Task11 {

//  11. Напечатать те из двузначных чисел которые делятся на 4, но не делятся на 6.

  public static void main(String[] args) {

    for (int i = 10; i < 100; i++) {
      if (i % 4 == 0 && i % 6 != 0) {
        System.out.println(i);
      }
    }

  }

}
