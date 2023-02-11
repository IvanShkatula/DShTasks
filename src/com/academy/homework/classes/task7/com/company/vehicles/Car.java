package com.academy.homework.classes.task7.com.company.vehicles;

import com.academy.homework.classes.task7.com.company.details.Engine;
import com.academy.homework.classes.task7.com.company.professions.Driver;

public class Car {
//  марка автомобиля, класс автомобиля, вес,
//Методы start(), stop(), turnRight(), turnLeft(), которые выводят на печать: "Поехали", "Останавливаемся",
// "Поворот направо" или "Поворот налево". А также метод printInfo(), который выводит полную информацию об автомобиле,
// ее водителе и моторе.

  private String carModel;
  private String carClass;
  private int weight;
  Driver driver;
  Engine engine;

  public Car(String carModel, String carClass, int weight, Driver driver, Engine engine) {
    this.carModel = carModel;
    this.carClass = carClass;
    this.weight = weight;
    this.driver = driver;
    this.engine = engine;
  }

  public void start() {
    System.out.println("Поехали");
  }

  public void stop() {
    System.out.println("Останавливаемся");
  }

  public void turnRight() {
    System.out.println("Поворот направо");
  }

  public void turnLeft() {
    System.out.println("Поворот налево");
  }

  public void printInfo(Car car) {
    System.out.println(car);
  }

  public String getCarModel() {
    return carModel;
  }

  public void setCarModel(String carModel) {
    this.carModel = carModel;
  }

  public String getCarClass() {
    return carClass;
  }

  public void setCarClass(String carClass) {
    this.carClass = carClass;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public Driver getDriver() {
    return driver;
  }

  public void setDriver(Driver driver) {
    this.driver = driver;
  }

  public Engine getEngine() {
    return engine;
  }

  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  @Override
  public String toString() {
    return "Car{" +
        "carModel='" + carModel + '\'' +
        ", carClass='" + carClass + '\'' +
        ", weight=" + weight +
        ", driver=" + driver +
        ", engine=" + engine +
        '}';
  }
}
