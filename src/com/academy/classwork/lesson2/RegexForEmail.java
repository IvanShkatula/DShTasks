package com.academy.classwork.lesson2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexForEmail {

  public static final Pattern PATERN = Pattern.compile("[\\w\\d]+@[a-z]{1,5}\\.(com|by|org)");

  public static void main(String[] args) {

    String email = "Ivan_Shkatula1@gmail.com";

    Matcher matcher = PATERN.matcher(email);
    System.out.println(matcher.matches());

    System.out.println(email.matches("[\\w\\d]+@[a-z]{1,5}\\.(com|by|org)")); // бысто проверить

  }

}
