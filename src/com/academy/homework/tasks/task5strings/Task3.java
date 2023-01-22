package com.academy.homework.tasks.task5strings;

import java.util.ArrayList;

public class Task3 {

  public static void main(String[] args) {

    ArrayList<String> list = CommonMethods.enterNWords();

    int middle = 0;
    int commonLength = 0;
    StringBuilder mainStringBuilder = new StringBuilder();

    for (String word : list) {
      commonLength += word.length();
    }

    middle = commonLength / list.size();

    //печать выше средней
    for (String word : list) {
      if (word.length() > middle) {
        System.out.println(mainStringBuilder.append(word).append(" ").append(word.length()));
      }
    }

    //печать ниже средней
    for (String word : list) {
      if (word.length() < middle) {
        System.out.println(mainStringBuilder.append(word).append(" ").append(word.length()));
      }
    }

  }


}
