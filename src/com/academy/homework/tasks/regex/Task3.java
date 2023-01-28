package com.academy.homework.tasks.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

//  3. Имеется строка с текстом. Вывести текст, составленный из последних букв
//  всех слов

  private static Pattern pattern = Pattern.compile("[a-zA-Z]+");

  public static void main(String[] args) {

    String text = " abcd ds fk sdlgk, sggr, sgrgsr  ";
    StringBuilder builder = new StringBuilder();

    Matcher matcher = pattern.matcher(text);

    while (matcher.find()) {
      builder.append(text.substring(matcher.end() - 1, matcher.end()));
    }

    System.out.println(builder);

  }
}
