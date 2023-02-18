package com.academy.classwork.lesson5;

import java.util.ArrayList;
import java.util.List;

public class City {
  private String name;
  private List<Street> streets;

  public City(String name) {
    this.name = name;
    streets = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void printStreets() {
    for (Street street : streets) {
      System.out.println(street.name);
      for (Street.Home home : street.homes) {
        System.out.println(home.number);
      }
    }
  }

  public class Street {

    private String name;
    private List<Home> homes;

    public Street(String name) {
      this.name = name;
      streets.add(this);
      homes = new ArrayList<>();
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    @Override
    public String toString() {
      return "Street{" +
          "name='" + name + '\'' +
          '}';
    }

    class Home {
      private int number;
private String name;
      public Home(int number, String name) {
        this.number = number;
        this.name = name;
        homes.add(this);

      }

      public void test(String name) {
        System.out.println(City.this.name);
        System.out.println(Street.this.name);
      }

      public int getNumber() {
        return number;
      }

      public void setNumber(int number) {
        this.number = number;
      }
    }
  }

}
