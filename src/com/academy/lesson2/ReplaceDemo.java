package com.academy.lesson2;

import java.util.Arrays;
import java.util.regex.Pattern;

public class ReplaceDemo {

  private static final Pattern pattern = Pattern.compile("(\\s+)|(\\d+)");

  public static void main(String[] args) {

    String string = "                   12345  12   1345    sgsrrh352v sg4   ";

   String resultString = string.replaceAll("\\s+", " ");
    System.out.println(resultString.trim());

    String java = "java5tiger 77 java6mustang";

   String[] javaResult = pattern.split(java);

    System.out.println(Arrays.toString(javaResult));

   // String[] javaResult2 = pattern.mat(java); // сделать через while (group)

  //  System.out.println(Arrays.toString(javaResult2));

  }
}
