package com.academy.homework.first_task.task1_string_compression;

public class StringCompression {

  public String compression(String incomeString) {
    String resultString = "";
    char startChar = incomeString.charAt(0);
    int count = 1;
    for (int i = 1; i < incomeString.length(); i++) {
      if (incomeString.charAt(i) == startChar) {
        count++;
      } else {
        resultString += "" + startChar + count;
        startChar = incomeString.charAt(i);
        count = 1;
      }
    }
    if (resultString.length() >= incomeString.length()) {
      return incomeString;
    }
    return resultString + startChar + count;
  }
}
