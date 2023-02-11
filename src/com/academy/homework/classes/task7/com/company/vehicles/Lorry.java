package com.academy.homework.classes.task7.com.company.vehicles;

import com.academy.homework.classes.task7.com.company.details.Engine;
import com.academy.homework.classes.task7.com.company.professions.Driver;

public class Lorry extends Car{

  private int carrying;

  public Lorry(String carModel, String carClass, int weight, Driver driver, Engine engine, int carrying) {
    super(carModel, carClass, weight, driver, engine);
    this.carrying = carrying;
  }

  @Override
  public String toString() {
    return "Lorry{" +
        "carrying=" + carrying +
        ", driver=" + driver +
        ", engine=" + engine +
        '}';
  }
}
