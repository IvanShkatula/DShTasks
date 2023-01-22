package com.academy.homework.first_task.task3_air_company.planes;

public abstract class Plane {
  private String model;
  private int carryingCapacity;
  private final int flightRange;
  private final int fuelConsumption;

  protected Plane(String model, int flightRange, int fuelConsumption) {
    this.model = model;
    this.flightRange = flightRange;
    this.fuelConsumption = fuelConsumption;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getCarryingCapacity() {
    return carryingCapacity;
  }

  public void setCarryingCapacity(int carryingCapacity) {
    this.carryingCapacity = carryingCapacity;
  }

  public int getFlightRange() {
    return flightRange;
  }

  public int getFuelConsumption() {
    return fuelConsumption;
  }

  public abstract int getTotalLoadCapacity();
  public abstract int getPeopleCapacity();

  @Override
  public String toString() {
    return "aircraftModel=" + model + ", peopleCapacity="
        + getPeopleCapacity() + ", totalCapacity=" + getTotalLoadCapacity()
        + ", flightRange=" + flightRange + ", fuelConsumption="
        + fuelConsumption + "]";
  }
}
