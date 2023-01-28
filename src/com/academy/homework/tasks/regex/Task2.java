package com.academy.homework.tasks.regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

  /*Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
  учесть, что слова могут разделяться несколькими пробелами, в начале и конце
  текста также могут быть пробелы, но могут и отсутствовать.*/

  private static Pattern pattern = Pattern.compile("[\\w]+");

  public static void main(String[] args) {

    String text = " abcd ds fk sdlgk, sggr, sgrgsr  ";
    int count = 0;

//    String[] resultArray = pattern.split(text);

//    System.out.println(Arrays.toString(resultArray));
//    System.out.println(resultArray.length);

    Matcher matcher = pattern.matcher(text);

    while (matcher.find()) {
      count++;
    }
    System.out.println(count);
  }
}
