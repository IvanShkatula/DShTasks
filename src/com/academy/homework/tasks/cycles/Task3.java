package com.academy.homework.tasks.cycles;

import java.util.Scanner;

public class Task3 {

/*3. Составьте программу, составьте программу, которая вычисляет произведение чисел от 1 до n. Значение n
  вводится с клавиатуры.*/

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.close();
    int sum = 1;

    for (int i = 1; i < n; i++) {
      sum *= i;
    }
    System.out.println(sum);
  }

}
