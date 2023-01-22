package com.academy.homework.tasks.task5strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {

  public static void main(String[] args) {

    int minLength = 100;
    int maxLength = 0;
    String minWord = "";
    String maxWord = "";

    ArrayList<String> list = CommonMethods.enterNWords();


    for (String word : list) {
      if (word.length() < minLength) {
        minLength = word.length();
        minWord = word;
      }

      if (word.length() > maxLength) {
        maxLength = word.length();
        maxWord = word;
      }
    }

    System.out.println(minWord + "   " + maxWord);

  }

}
