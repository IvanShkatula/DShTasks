package com.academy.homework.first_task.task3_air_company.logic;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.academy.homework.first_task.task3_air_company.planes.Plane;

public class Logic {

  public void calculateTotalCargoPeopleCapacity(List<Plane> planesList) {
    int totalPeopleCapacity = 0;
    int totalLoadCapacity = 0;
    for (int i = 0; i < planesList.size(); i++) {
      totalPeopleCapacity += planesList.get(i).getPeopleCapacity();
      totalLoadCapacity += planesList.get(i).getTotalLoadCapacity();
    }

    System.out.println("Total passenger capacity is " + totalPeopleCapacity);
    System.out.println("Total cargo capacity is " + totalLoadCapacity);
  }

  public void sortByFlightRange(List<Plane> planesList) {
    Collections.sort(planesList, Comparator.comparingInt(Plane::getFlightRange));
    System.out.println(planesList);
  }

  public void getPlaneByFuelConsumption(List<Plane> planesList, int fromFuelConsumption, int toFuelConsumption) {
    int count = 0;
    for (Plane plane : planesList) {
      if (fromFuelConsumption <= plane.getFuelConsumption() && plane.getFuelConsumption() <= toFuelConsumption) {
        count++;
        System.out.println(plane.getModel());
      }
    }
    if (count == 0){
      System.out.println("Aircraft matching these requirements was not found");
    }
  }
}
