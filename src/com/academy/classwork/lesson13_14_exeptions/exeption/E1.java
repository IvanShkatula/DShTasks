package com.academy.classwork.lesson13_14_exeptions.exeption;

public class E1 extends Exception{
  public E1() {
  }

  public E1(String message) {
    super(message);
  }

  public E1(String message, Throwable cause) {
    super(message, cause);
  }

  public E1(Throwable cause) {
    super(cause);
  }

  public E1(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
