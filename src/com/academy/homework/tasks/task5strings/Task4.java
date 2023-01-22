package com.academy.homework.tasks.task5strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task4 {

  /*4. Ввести n слов с консоли. Найти слово, в котором число различных символов минимально.
  Если таких слов несколько, найти первое из них.*/

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
