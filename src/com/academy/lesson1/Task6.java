package com.academy.lesson1;

import java.util.Scanner;

public class Task6 {

//  6. Ввести n слов с консоли. Найти слово, символы в котором идут в строгом порядке
//  возрастания их кодов. Если таких слов несколько, найти первое из них.

  public static void main(String[] args) {


    try (Scanner scanner = new Scanner(System.in)) {
      int n = scanner.nextInt();
      outer:
      for (int i = 0; i < n; i++) {
        String str = scanner.next();
        char[] chars = str.toCharArray();
        for (int j = 1; j < chars.length; j++) {
          if (chars[j - 1] >= chars[j]) {
            continue outer;
          }
        }
        System.out.println(str);
      }
    }

  }


}
