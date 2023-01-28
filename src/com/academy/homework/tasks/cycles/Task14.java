package com.academy.homework.tasks.cycles;

import java.util.Scanner;

public class Task14 {

//  14. Составьте программу, которая вычисляет сумму квадратов чисел от 1 до введенного вами целого числа N.


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    int sum = 0;

    for (int i = 1; i < num; i++) {
      sum += Math.pow(i, 2);
    }
    System.out.println(sum);
  }
}
