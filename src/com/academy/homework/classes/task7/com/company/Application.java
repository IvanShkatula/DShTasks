package com.academy.homework.classes.task7.com.company;

import com.academy.homework.classes.task7.com.company.details.Engine;
import com.academy.homework.classes.task7.com.company.professions.Driver;
import com.academy.homework.classes.task7.com.company.professions.Person;
import com.academy.homework.classes.task7.com.company.vehicles.Car;

public class Application {

  public static void main(String[] args) {
    Driver driver = new Person("FIO", 2, "fullname");
    Car car = new Car("model", "calss", 20, driver, new Engine(4, 5));

    car.printInfo(car);
  }
}
