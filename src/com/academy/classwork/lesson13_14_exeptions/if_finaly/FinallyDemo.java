package com.academy.classwork.lesson13_14_exeptions.if_finaly;

public class FinallyDemo {
  public static void main(String[] args) {
 /*   int[] array = {1, 2, 3};
    try {
      System.out.println("tryBefore");
      array[5] = 5;
      System.out.println("tryAfter");
      return;
    } catch (ArrayIndexOutOfBoundsException e) {
      array[2] = 5;
      System.out.println("catch");
      return;
    } finally {
      System.out.println("finally");
    }*/

    System.out.println(process());
  }

  public static int process() {
    try {
      System.out.println("try");
      return 1;
    } finally {
      System.out.println("finally");

      return 100;
    }
  }


}
