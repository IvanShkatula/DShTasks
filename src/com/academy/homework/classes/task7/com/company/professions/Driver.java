package com.academy.homework.classes.task7.com.company.professions;

public class Driver {
  private String fIO;
  private int drivingAge;

  public Driver(String fIO, int drivingAge) {
    this.fIO = fIO;
    this.drivingAge = drivingAge;
  }

  public String getfIO() {
    return fIO;
  }

  public void setfIO(String fIO) {
    this.fIO = fIO;
  }

  public int getDrivingAge() {
    return drivingAge;
  }

  public void setDrivingAge(int drivingAge) {
    this.drivingAge = drivingAge;
  }

  @Override
  public String toString() {
    return "Driver{" +
        "fIO='" + fIO + '\'' +
        ", drivingAge=" + drivingAge +
        '}';
  }
}
