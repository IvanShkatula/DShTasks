package com.academy.classwork.lesson3.deal;

import java.util.Objects;

public class Milk extends Product {

  private String fatContent;

  public Milk(String fatContent) {
    this.fatContent = fatContent;
  }

  public Milk(int id, String name, int quantity, double price, String fatContent) {
    super(id, name, quantity, price);
    this.fatContent = fatContent;
  }

  @Override
  protected double discount() {
    if (quantity <= 10) {
      return 1;
    } else if (quantity <= 20) {
      return 0.9;
    }
    return 0.8;
  }

  @Override
  protected Product[] addProduct() {
    return new Product[0];
  }

  public String getFatContent() {
    return fatContent;
  }

  public void setFatContent(String fatContent) {
    this.fatContent = fatContent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;

    Milk milk = (Milk) o;

    return Objects.equals(fatContent, milk.fatContent);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (fatContent != null ? fatContent.hashCode() : 0);
    return result;
  }
}
