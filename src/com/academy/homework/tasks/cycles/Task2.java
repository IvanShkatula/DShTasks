package com.academy.homework.tasks.cycles;

import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

public class Task2 {

/*2. Составьте программу, которая вычисляет сумму чисел от 1 до n.
  Значение n вводится с клавиатуры.*/

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.close();

    for (int i = 1, sum = 0; i < n; i++) {
      sum += i;
    }

  }

}
