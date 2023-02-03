package com.academy.lesson3.deal;

import java.util.Objects;

public abstract class Product {

  protected String name;
  protected int quantity;
  protected double price;
  protected int id;

  public Product() {
  }

  public Product(int id, String name, int quantity, double price) {
    this.id = id;
    this.name = name;
    this.quantity = quantity;
    this.price = price;
  }

  protected abstract double discount();

  protected abstract Product[] addProduct();

  protected double calcPrice() {
    return price * quantity * discount();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getQuantity() {
    return quantity;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public String toString() {

    return "id=" + id +
        ", name='" + name + '\'' +
        ", quantity=" + quantity +
        ", price=" + price + "\n";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Product product = (Product) o;

    if (quantity != product.quantity) return false;
    if (Double.compare(product.price, price) != 0) return false;
    return Objects.equals(name, product.name);
  }

  @Override
  public int hashCode() {
    int result;
    long temp;
    result = name != null ? name.hashCode() : 0;
    result = 31 * result + quantity;
    temp = Double.doubleToLongBits(price);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    return result;
  }
}
