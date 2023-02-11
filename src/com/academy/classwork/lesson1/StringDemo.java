package com.academy.classwork.lesson1;

public class StringDemo {

  public static void main(String[] args) {
    String str1 = "Hello";
    String str2 = "Hello";
    String str3 = "Hello";
    String str4 = "java";
    String str5 = "java";
    String str6 = "word";
    String str7 = new String("Hello");
    String str8 = str7.intern();

    System.out.println(str1 == str2);
    System.out.println(str1.equals(str2));
    System.out.println(str1 == str7);
    System.out.println(str1.equals(str7));

    System.out.println(str1 == str8);
    System.out.println(str1.equals(str8));

  }

}
