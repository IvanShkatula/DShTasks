package com.academy.classwork.lesson8_gemerics.calculator;

import java.text.DecimalFormat;
import java.util.Formatter;

public class Calculator {

/*  Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы
  - sum, multiply, divide, subtraction.
  Параметры этих методов  - два числа разного типа, над которыми должна быть произведена операция.*/
private static DecimalFormat formatter = new DecimalFormat("#.##");
  public static <T extends Number, V extends Number> String sum(T x, V y) {
    return formatter.format(x.doubleValue() + y.doubleValue());
  }
  public static <T extends Number, V extends Number> String multiply(T x, V y) {
    return formatter.format(x.doubleValue() * y.doubleValue());
  }
  public static <T extends Number, V extends Number> String divide(T x, V y) {

    return formatter.format(x.doubleValue() / y.doubleValue());
  }
  public static <T extends Number, V extends Number> String subtraction(T x, V y) {
    return formatter.format(x.doubleValue() - y.doubleValue());
  }

  public static void main(String[] args) {
    System.out.println(sum(2, 3.0));
    System.out.println(divide(0.2, 3));
  }

}
