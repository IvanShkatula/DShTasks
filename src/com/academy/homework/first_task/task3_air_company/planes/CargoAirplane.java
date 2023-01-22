package com.academy.homework.first_task.task3_air_company.planes;

public class CargoAirplane extends Plane {

  private int totalLoadCapacity;
  private int cargoCapacity;
  private int peopleCapasity;


  public CargoAirplane(String model, int flightRange, int fuelConsumption, int cargoCapacity, int peopleCapasity) {
    super(model, flightRange, fuelConsumption);

    this.cargoCapacity = cargoCapacity;
    this.peopleCapasity = peopleCapasity;
    this.totalLoadCapacity = cargoCapacity + (peopleCapasity * 80);
  }


  @Override
  public int getTotalLoadCapacity() {
    return totalLoadCapacity;
  }

  @Override
  public int getPeopleCapacity() {
    return peopleCapasity;
  }
}
