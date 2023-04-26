package com.academy.classwork.lesson13_14_exeptions;

public class MathException {

  public static void main(String[] args) {
    Double ad = 5.0;
    Double bd = 0.0;
    System.out.println(ad / bd);

   /* try {
      int a = 5;
      int b = 0;
      System.out.println(a / b);
    } catch (ArithmeticException e) {
      System.out.println(e);
    }*/

   /* try {
      wraper1();
    } catch (ArithmeticException e) {
      System.out.println(e);
    }*/

    wraper1();
    System.out.println("end program");
  }

  private static void wraper1() {
    wraper2();
  }

  private static void wraper2() {
    try {
      wraper3();
    } catch (CheckedException e) {
      System.out.println(e);
      System.err.println(e);
      e.printStackTrace();
    }

  }

  private static void wraper3() throws CheckedException{
    /*try {
      wraper4();
    } catch (ArithmeticException e) {
      System.out.println(e);
    }*/

    wraper4();
  }

  private static void wraper4() throws CheckedException {
    int a = 5;
    int b = 5;
//    System.out.println(a / b);
    if (a == b) {
      throw new CheckedException("a != b");
    }
  }

}
