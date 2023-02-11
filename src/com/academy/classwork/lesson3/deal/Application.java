package com.academy.classwork.lesson3.deal;

public class Application {

  public static void main(String[] args) {
    Person seller = new Person();
    Person buyer = new Person("Ivan", 500);

    Product[] products = new Product[5];

    Milk milk1 = new Milk(1, "Savushkin", 2, 3.0, "2.5");
    Milk milk2 = new Milk(2, "Minskiy", 11, 2.5, "3");
    Milk milk3 = new Milk(3, "SavushkinNew", 100, 1.5, "extra fat");
    Bread bread1 = new Bread(4, "Narachancki", 2, 0.8, 1);
    Bread bread2 = new Bread(5, "Vodar", 11, 0.8, 3);
    Milk milkTest = new Milk(7, "SavushkinNew", 100, 1.5, "extra fat");

    products[0] = milk1;
    products[1] = milk2;
    products[2] = milk3;
    products[3] = bread1;
    products[4] = bread2;


    Deal deal = new Deal(products, seller, buyer);
 //   deal.addProduct(milkTest);
//    deal.addProduct(32, "Milk4", 4,2.56,"3");
//    deal.addProduct(33, "BreadNew", 4,2.56, 5);
    deal.deleteProduct(1);
//    deal.deal();
   deal.printBill();
//    System.out.println(seller);
//    System.out.println(buyer);
  }
}
