package com.academy.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ForInvestigate {

  public static void main(String[] args) {
  String s = "";

  String finals = s.trim().replaceAll("\n|\r\n", "");
  String finals2 = finals.replaceAll(" ", "");

    System.out.println(finals2);

  }

}
