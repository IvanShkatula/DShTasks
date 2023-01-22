package com.academy.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ForInvestigate {

  public static void main(String[] args) {
    Pattern pattern = Pattern.compile("[a-zA-Z]+\\d+\\.[a-z]{3}");
    Matcher matcher = pattern.matcher("file123.doc");
    boolean b = matcher.matches();
    System.out.println(b);

  }

}
