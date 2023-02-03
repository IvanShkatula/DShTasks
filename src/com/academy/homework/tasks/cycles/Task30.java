package com.academy.homework.tasks.cycles;

public class Task30 {

//  30. С помощью оператора while напишите программу определения суммы всех нечетных чисел в диапазоне от 1 до 99 включительно.

  public static void main(String[] args) {
    int i = 1;
    int sum = 0;

// вот так работает а если поменять местами true и false то нет. и почему в нельзя написать  while (i == 100)
    while (i < 100) {
      if (i % 2 != 0) {
        sum += i;
      }
      i++;
    }


    System.out.println(sum);

  }
}
