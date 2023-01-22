package com.academy.homework.tasks.cycles;

public class Task8 {

//8. Даны натуральные числа от 20 до 50.Напечатать те из них, которые делятся на 3, но не делятся на 5.

  public static void main(String[] args) {

    for (int i = 20; i < 50; i++) {
      if (i % 3 == 0 && i % 5 != 0) {
        System.out.println(i);
      }
    }

  }

}
