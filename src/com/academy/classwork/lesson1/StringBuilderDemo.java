package com.academy.classwork.lesson1;

import java.util.Scanner;

public class StringBuilderDemo {

  public static void main(String[] args) {

// ввести n строк. если встречается 3 символ =b меняем первый символ на 1,
// если 3 симво = c - переворачиваем строку, иначе удаляем последний

    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    StringBuilder mainStringBuilder = new StringBuilder();

    for (int i = 0; i < n; i++) {
      StringBuilder str = new StringBuilder(scanner.next());
      if (str.charAt(2) == 'b') {
        str.setCharAt(0, '1');
      } else if (str.charAt(2) == 'c') {
        str.reverse();
      } else {
        str.deleteCharAt(str.length() - 1);
      }
      mainStringBuilder.append(str).append(" ");
    }
    System.out.println(mainStringBuilder);
  }
}
