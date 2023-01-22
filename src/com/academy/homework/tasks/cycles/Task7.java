package com.academy.homework.tasks.cycles;

import java.util.Scanner;

public class Task7 {

//  7. Ввести с клавиатуры 10 пар чисел. сравнить числа в каждой паре и напечатать большие из них.

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < 10; i++) {
      System.out.println(Math.max(scanner.nextInt(), scanner.nextInt()));
    }

  }

}
