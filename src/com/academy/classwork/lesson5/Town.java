package com.academy.classwork.lesson5;

public class Town {
  public static int numberOfPeople;

  public static void  printInfo() {
    System.out.println("Улица");
  }

  public static class Street {
    public static void printInfo() {
      System.out.println("Улица Октябрьская");
    }

    public void printNumberOfPeople(){
      System.out.println(numberOfPeople);
      printInfo();
      Town.printInfo();
    }
  }

  public static void main(String[] args) {
    Town.Street street = new Town.Street();
    Town.Street.printInfo();
    Town.printInfo();

    City city = new City("cityName");
    City.Street street1 = city.new Street("streetName1");
  }
}
