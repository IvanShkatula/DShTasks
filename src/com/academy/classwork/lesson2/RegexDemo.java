package com.academy.classwork.lesson2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

  public static void main(String[] args) {

    String text = "Используются файлы file1.doc, file2.txt. А еще было бы неплохо обратить " +
        "внимание на файл file3.img. Также просмотрите содержимое file4.doc.";

    Pattern pattern = Pattern.compile("[a-zA-Z]+\\d+\\.[a-z]{3}");
    Matcher matcher = pattern.matcher(text);
    boolean b = matcher.matches();
    System.out.println(b);

    while (matcher.find()) {
      int start = matcher.start();
      int end = matcher.end();
      System.out.println(text.substring(start, end));
      System.out.println(matcher.group());
    }

  }

}
