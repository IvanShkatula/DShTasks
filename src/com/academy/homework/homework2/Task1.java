package com.academy.homework.homework2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {


  public static void main(String[] args) {

    Map<Character, Integer> wordMap = new HashMap<>();
    Map<Character, Integer> wordMap2 = new HashMap<>();
    Scanner scanner = new Scanner(System.in);
    StringBuilder wordBuilder1 = new StringBuilder(scanner.nextLine());
    StringBuilder wordBuilder2 = new StringBuilder(scanner.nextLine());

    if (wordBuilder1.length() != wordBuilder2.length()) {
      return;
    }

    for (int i = 0; i < wordBuilder1.length(); i++) {
      if (!wordMap.containsKey(wordBuilder1.charAt(i))) {
        wordMap.put(wordBuilder1.charAt(i), 1);
      } else {
        wordMap.put(wordBuilder1.charAt(i), wordMap.get(wordBuilder1.charAt(i)) + 1);
      }
    }

    for (int i = 0; i < wordBuilder2.length(); i++) {
      if (!wordMap2.containsKey(wordBuilder2.charAt(i))) {
        wordMap2.put(wordBuilder2.charAt(i), 1);
      } else {
        wordMap2.put(wordBuilder2.charAt(i), wordMap2.get(wordBuilder2.charAt(i)) + 1);
      }
    }

    boolean isEquals = wordMap.equals(wordMap2);

    if (isEquals) {
      System.out.println("Строки идентичны");
    } else {
      System.out.println("Строки не идентичны");
    }

  }

}
