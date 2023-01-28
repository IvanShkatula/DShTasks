package com.academy.homework.tasks.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

  public static void main(String[] args) {

    /*Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
    общее их количество!*/

    String incomeString = "Вчера целый, день шёл. проливной дождь.";
    int count = 0;

    Pattern pattern = Pattern.compile("[\\.,!\\?]");
    //почему не сработал \\W или [:punct:] и что это значит?

    String[] arrayString;

    arrayString = incomeString.split("");

    for (String s : arrayString) {
      Matcher matcher = pattern.matcher(s);
      if (matcher.matches()) {
        count++;
      }
    }

    System.out.println(count);

  }

}
// Как упростить?