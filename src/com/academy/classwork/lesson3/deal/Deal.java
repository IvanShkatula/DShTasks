package com.academy.classwork.lesson3.deal;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Deal {

  private Product[] listOfProducts;
  private Person seller;
  private Person buyer;

  public Deal() {
    super();
  }

  private final String SHOP_NAME = "Korona";

  private final static DateTimeFormatter BILL_DATE = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

  private int index = 0;

  public Deal(Product[] listOfProducts, Person seller, Person buyer) {
    this.listOfProducts = listOfProducts;
    this.seller = seller;
    this.buyer = buyer;
    for (int i = 0; i < listOfProducts.length; i++) {
      index++;
      if (listOfProducts[i] == null) {
        break;
      }
    }
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
    String finalTime = localTime.format(BILL_DATE);
    //    название магазина | текущая дата | каждая позиция с количеством, ценой и дискаунтом | конечная цена

    StringBuilder productsInBill = new StringBuilder();

    for (int i = 0; i < index; i++) {
      productsInBill.append(listOfProducts[i]);
    }

    System.out.printf("%s%nТекущая дата: %s%n%s%nИтого: %.2f рублей", SHOP_NAME, finalTime, productsInBill, finalPrice());
  //Arrays.toString(listOfProducts);

  }

  public void addProduct(Product p) {
    if (listOfProducts.length <= index) {
      grow();
    }
    listOfProducts[index++] = p;
  }

  private void grow() {
    Product[] temp = new Product[listOfProducts.length * 2 + 1];
    System.arraycopy(listOfProducts, 0, temp, 0, listOfProducts.length);
    listOfProducts = temp;
  }


  public void deleteProduct(int id) {

    for (int i = 0; i < listOfProducts.length; i++) {
      if (listOfProducts[i].id == id) {
        System.arraycopy(listOfProducts, i +1, listOfProducts, i, index - 1 - i);
        listOfProducts[index - 1] = null;
        index--;
        break;
      }
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
              addProduct(new Milk(id, name, quantity, price, fatContent));
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
              addProduct(new Bread(idB, nameB, quantityB, priceB, age));
            }
            default -> System.out.println("Повторите ввод");
          }
          break;
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
