package com.academy.homework.tasks.task5strings;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {

  public static void main(String[] args) {

    ArrayList<String> list = CommonMethods.enterNWords();

    String[] array = list.toArray(new String[0]);

    for (int i = array.length - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        if (array[j].length() > array[j + 1].length()) {
          String temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < i; j++) {
        if (array[j].length() < array[j + 1].length()) {
          String temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }

    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }

  }

}
