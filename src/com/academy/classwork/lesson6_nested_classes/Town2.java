package com.academy.classwork.lesson6_nested_classes;

public class Town2 {
  private String postCode = "220117";
  public void createAddress() {
    int houseNumber = 5;
    class Street{
      public String streetName = "nameStreet";
      public void printAddress() {
//        System.out.println(postCode + " " + houseNumber  + " " + streetName);
//        houseNumber = 6;
        postCode = "10";
        streetName = "newStreeName";
      }
    }
    Street street = new Street();
    street.printAddress();
  }

  public static void main(String[] args) {
    Town2 town2 = new Town2();
    town2.createAddress();
  }
}
