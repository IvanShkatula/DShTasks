package com.academy.homework.tasks.cycles;

import java.util.Scanner;

public class Task4 {
/*
4. С клавиатуры вводятся n чисел.
  Составьте программу, которая определяет кол-во отрицательных,
  кол-во положительных и кол-во нулей среди введеных чисел.
  Значение n вводится с клавиатуры.*/

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] array = new int[n];
    int positive = 0;
    int negative = 0;
    int zero = 0;

    for (int i = 0; i < n; i++) {
      array[i] = scanner.nextInt();
    }

    for (int num : array) {
      if (num > 0) {
        positive++;
      } else if (num == 0) {
        zero++;
      } else {
        negative++;
      }
    }

    System.out.println(new StringBuilder().append(positive).append(" ").append(negative).append(" ").append(zero));
    // почему предлагает заменить на стринг??
  }

}
