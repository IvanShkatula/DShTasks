package com.academy.homework.first_task.task3_air_company.runner;

import java.util.ArrayList;
import java.util.List;

import com.academy.homework.first_task.task3_air_company.logic.Logic;
import com.academy.homework.first_task.task3_air_company.planes.CargoAirplane;
import com.academy.homework.first_task.task3_air_company.planes.LightAircraft;
import com.academy.homework.first_task.task3_air_company.planes.PassengerAircraft;
import com.academy.homework.first_task.task3_air_company.planes.Plane;

public class Main {


  public static void main(String[] args) {
    Logic logic = new Logic();

    List<Plane> airCompany = new ArrayList();

    Plane cargoPlane = new CargoAirplane("cargoPlane", 1700, 100, 90, 5);
    Plane passengerPlane = new PassengerAircraft("passengerPlane", 3600, 20, 100, 400);
    Plane lightPlane = new LightAircraft("lightAircraft", 800, 70, 0, 2);

    airCompany.add(cargoPlane);
    airCompany.add(passengerPlane);
    airCompany.add(lightPlane);

    logic.calculateTotalCargoPeopleCapacity(airCompany);

    System.out.println();

    logic.sortByFlightRange(airCompany);

    System.out.println();

    logic.getPlaneByFuelConsumption(airCompany, 20, 100);
  }



}
