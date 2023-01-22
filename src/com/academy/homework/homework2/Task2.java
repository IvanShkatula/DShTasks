package com.academy.homework.homework2;

import java.util.ArrayList;
import java.util.List;

import com.academy.homework.tasks.task5strings.CommonMethods;

public class Task2 {

  public static void main(String[] args) {

    ArrayList<String> list;
    List<Character> resultList = new ArrayList<>();

    list = CommonMethods.enterNWords();
    int min = 30;
    String resultWord = "";

    for (String word : list) {
      for (int i = 0; i < word.length(); i++) {
        if (!resultList.contains(word.charAt(i))) {
          resultList.add(word.charAt(i));
        }
      }
      if (resultList.size() < min) {
        min = resultList.size();
        resultWord = word;
      }

      if (min == 1) {
        System.out.println(word);
        return;
      }
      resultList.clear();
    }

    System.out.println(resultWord);

  }

}
