package com.academy.homework.tasks.cycles;

import java.util.Scanner;

public class Task6 {

//6. В сберкассу на трёхпроцентный вклад положили S рублей.Какой станет сумма вклада через N лет.

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    double s = scanner.nextInt();
    int n = scanner.nextInt();


    for (int i = 0; i < n; i++) {
      s += s * 0.03;
    }
    System.out.println(s);
    scanner.close();

  }

}
