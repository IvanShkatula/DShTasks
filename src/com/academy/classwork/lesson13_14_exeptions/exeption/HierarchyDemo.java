package com.academy.classwork.lesson13_14_exeptions.exeption;

public class HierarchyDemo {

  public static void main(String[] args) {
    try {
      wraper1();
    } catch (E4 e) {
      System.out.println("E4");
    } catch (E3 e) {
      System.out.println("E3");
    } catch (E2 e) {
      System.out.println("E2");
    } catch (E1 e) {
      System.out.println("E1");
    } catch (NewE1 e1) {
      System.out.println("NewE1");
    }
    try {
      wraper1();
    } catch (E1 e) {
      System.out.println("E");
    } catch (NewE1 e1) {
      System.out.println("NewE1");
    }
    try {
      wraper1();
    } catch (E1 | NewE1 e) {
      System.out.println("multiple catch" + e.getMessage());
    }
  }

  private static void wraper1() throws E1, NewE1 {
    wraper2();
  }

  private static void wraper2() throws E1, NewE1 {
    wraper3();
  }

  private static void wraper3() throws E1, NewE1 {
    int i = 1;
    if (i == 1) {
      throw new E1("i = 1");
    } else if (i == 2) {
      throw new E2();
    } else if (i == 3) {
      throw new E3();
    } else if (i == 4) {
      throw new E4();
    } else if (i == 5) {
      throw new NewE1();
    }
  }
}
