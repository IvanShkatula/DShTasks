package com.academy.lesson2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CompareTwoWords {

  public static void main(String[] args) {
    Map<Character, Integer> wordMap = new HashMap<>();
    Map<Character, Integer> wordMap2 = new HashMap<>();
    Scanner scanner = new Scanner(System.in);
    StringBuilder wordBuilder1 = new StringBuilder(scanner.nextLine());
    StringBuilder wordBuilder2 = new StringBuilder(scanner.nextLine());
    scanner.close();

    if (wordBuilder1.length() != wordBuilder2.length()) {
      System.out.println("Строки не являются перестановкой");
      return;
    }

    int[] charsCounter = new int[256];

    for (int i = 0; i < wordBuilder1.length(); i++) {
      charsCounter[wordBuilder1.charAt(i)]++;
      charsCounter[wordBuilder2.charAt(i)]--;
    }

    for (int num : charsCounter) {
      if (num != 0) {
        System.out.println("Строки не являются перестановкой");
        return;
      }
    }
    System.out.println("Являются");
  }
}
