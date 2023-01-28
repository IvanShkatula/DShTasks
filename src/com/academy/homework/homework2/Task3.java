package com.academy.homework.homework2;

import java.util.Scanner;

public class Task3 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    StringBuilder word1 = new StringBuilder(scanner.next());
    StringBuilder word2 = new StringBuilder(scanner.next());
    scanner.close();
    StringBuilder resultWord = new StringBuilder();
    // String word1 = "abcd";

    if (word1.length() % 2 != 0 || word2.length() % 2 != 0) {
      return;
    }


    resultWord.append(word1.substring(0, word1.length() / 2))
        .append(word2.substring((word2.length() / 2), word2.length()));

    System.out.println(resultWord);

  }

}
