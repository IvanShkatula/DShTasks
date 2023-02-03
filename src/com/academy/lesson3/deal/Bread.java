package com.academy.lesson3.deal;

import java.time.LocalDateTime;

public class Bread extends Product{

  int age;
  @Override
  protected double discount() {
    LocalDateTime localDateTime = LocalDateTime.now();

    if (quantity <= 10) {
      return 0.8;
    } else if (localDateTime.getHour() >= 10) {
      return 0.6;
    }
    return 15;
  }

  @Override
  protected Product[] addProduct() {
    return new Product[0];
  }

  public Bread(int age) {
    this.age = age;
  }

  public Bread(int id, String name, int quantity, double price, int age) {
    super(id, name, quantity, price);
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;

    Bread bread = (Bread) o;

    return age == bread.age;
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + age;
    return result;
  }
}
