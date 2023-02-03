package com.academy.lesson3.deal;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Deal {

  private Product[] listOfProducts;
  private Person seller;
  private Person buyer;

  public Deal() {
    super();
  }

  private final String SHOP_NAME = "Korona";

  public Deal(Product[] listOfProducts, Person seller, Person buyer) {
    this.listOfProducts = listOfProducts;
    this.seller = seller;
    this.buyer = buyer;
  }

  private double finalPrice() {
    double sum = 0;

    for (Product product : listOfProducts) {
      if (product == null) break;
      sum += product.calcPrice();
    }
    return sum;
  }

  public void deal() {
    double count = finalPrice();

    if (buyer.getMoneyAmount() < count) {
      System.out.println("Недостаточно денег");
      return;
    }

    buyer.setMoneyAmount(buyer.getMoneyAmount() - count);
    seller.setMoneyAmount(seller.getMoneyAmount() + count);
  }

  public void printBill() {
    LocalDateTime localTime = LocalDateTime.now();
    String finalTime = localTime.getYear() + " "
        + localTime.getMonth() + " "
        + localTime.getDayOfMonth() + " "
        + localTime.getHour() + ":"
        + localTime.getMinute();
    //    название магазина | текущая дата | каждая позиция с количеством, ценой и дискаунтом | конечная цена

    StringBuilder productsInBill = new StringBuilder();

    for (int i = 0; i < listOfProducts.length; i++) {
      productsInBill.append(listOfProducts[i]);
    }

    System.out.printf("%s%nТекущая дата: %s%n%s%nИтого: %.2f рублей", SHOP_NAME, finalTime, productsInBill, finalPrice());
// я хочу переиспользовать Arrays.toString(listOfProducts) но убрать некоторые символы, где его нужно переиспользовать?

  }

  public void addProduct(int id, String name, int quantity, double price, String fatContant) {

    increaseArraySizeBy1();

    for (int i = 0; i < listOfProducts.length; i++) {
      if (listOfProducts[i] == null) {
        listOfProducts[i] = new Milk(id, name, quantity, price, fatContant);
        break;
      }
    }

  }

  public void addProduct(int id, String name, int quantity, double price, int age) {

    increaseArraySizeBy1();

    for (int i = 0; i < listOfProducts.length; i++) {
      if (listOfProducts[i] == null) {
        listOfProducts[i] = new Bread(id, name, quantity, price, age);
        break;
      }
    }
  }

  public void deleteProduct(int id) {

    for (int i = 0; i < listOfProducts.length; i++) {
      if (listOfProducts[i].id == id) {
        listOfProducts[i] = null;
      }
    }
    // можно ли сделать через простой for??????

    for (int i = 0; i < listOfProducts.length - 1; i++) {
      if (listOfProducts[i] == null) {
        listOfProducts[i] = listOfProducts[i + 1];
        listOfProducts[i + 1] = null;
      }
    }

    listOfProducts = Arrays.copyOf(listOfProducts, listOfProducts.length - 1);
  }

  private void increaseArraySizeBy1() {
    if (listOfProducts[listOfProducts.length - 1] != null) {
      listOfProducts = Arrays.copyOf(listOfProducts, listOfProducts.length + 1);
    }
  }

  public void terminal() {
    Scanner scanner = new Scanner(System.in);

    boolean bool = true;

    while (bool) {
      System.out.println("выберите действие view add delete");
      String st = scanner.next();
      switch (st) {
        case "view":
          StringBuilder productsInBill = new StringBuilder();
          for (int i = 0; i < listOfProducts.length; i++) {
            productsInBill.append(listOfProducts[i]);
          }
          System.out.println(productsInBill);
          break;
        case "add":
          System.out.println("Введите продукт для добавления");
          String product = scanner.next();
          switch (product) {
            case "Milk" -> {
              System.out.println("Введите id");
              int id = scanner.nextInt();
              System.out.println("Введите имя");
              String name = scanner.next();
              System.out.println("Введите количество");
              int quantity = scanner.nextInt();
              System.out.println("Введите цену");
              double price = scanner.nextDouble();
              System.out.println("Введите жирность");
              String fatContent = scanner.next();
              addProduct(id, name, quantity, price, fatContent);
            }
            case "Bread" -> {
              System.out.println("Введите id");
              int idB = scanner.nextInt();
              System.out.println("Введите имя");
              String nameB = scanner.next();
              System.out.println("Введите количество");
              int quantityB = scanner.nextInt();
              System.out.println("Введите цену");
              double priceB = scanner.nextDouble();
              System.out.println("Введите возраст");
              int age = scanner.nextInt();
              addProduct(idB, nameB, quantityB, priceB, age);
            }
            default -> System.out.println("Повторите ввод");
          } break;
        case "delete":
          System.out.println("Введите id");
          int idToDelete = scanner.nextInt();
          deleteProduct(idToDelete);
          break;
        default:
          System.out.println("Повторите ввод");
          break;
      }
      if (st.equals("end")) {
        bool = false;
      }
    }
  }

  public Product[] getListOfProducts() {
    return listOfProducts;
  }

  public void setListOfProducts(Product[] listOfProducts) {
    this.listOfProducts = listOfProducts;
  }

  public Person getSeller() {
    return seller;
  }

  public void setSeller(Person seller) {
    this.seller = seller;
  }

  public Person getBuyer() {
    return buyer;
  }

  public void setBuyer(Person buyer) {
    this.buyer = buyer;
  }
}
