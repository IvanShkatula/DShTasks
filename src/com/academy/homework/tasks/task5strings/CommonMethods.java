package com.academy.homework.tasks.task5strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommonMethods {

  public static ArrayList<String> enterNWords() {

    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    ArrayList<String> list = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      list.add(scanner.next());
    }
    return list;
  }

}
