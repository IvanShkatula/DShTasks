package com.academy.lesson3.deal;

public class Person {

  private String name;
  private double moneyAmount;

  public Person() {
    super();
  }

  public Person(String name, double moneyAmount) {
    this.name = name;
    this.moneyAmount = moneyAmount;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getMoneyAmount() {
    return moneyAmount;
  }

  public void setMoneyAmount(double moneyAmount) {
    this.moneyAmount = moneyAmount;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", moneyAmount=" + moneyAmount +
        '}';
  }
}
