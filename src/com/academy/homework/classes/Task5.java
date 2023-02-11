package com.academy.homework.classes;

public class Task5 {

  public static void main(String[] args) {
recursionAB(5, 1);
  }

  private static int recursionAB(int a, int b) {
    if (a == b) {
      return b;
    }
    System.out.println(recursionAB(a, b+1));
    return b;
  }

}
