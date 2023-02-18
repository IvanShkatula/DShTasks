package com.academy.classwork.lesson5;

public class Application {

  public static void main(String[] args) {
    City minsk = new City("Minsk");
    City.Street s1 = minsk.new Street("st1Name2");
    City.Street s2 = minsk.new Street("st2Name2");
    City.Street s3 = minsk.new Street("s22Name2");

    City.Street.Home h1 = s1.new Home(1, "n1");
    s1.new Home(2, "n2");
    s1.new Home(3, "n3");


    //minsk.printStreets();
    h1.test("hello");

  }
}
