package task3_air_company.planes;

public class LightAircraft extends Plane {

  private int totalLoadCapacity;
  private int peopleCapacity;
  private int cargoCapacity;

  public LightAircraft(String model, int flightRange, int fuelConsumption, int cargoCapacity, int peopleCapasity) {
    super(model, flightRange, fuelConsumption);

    this.peopleCapacity = peopleCapasity;
    this.cargoCapacity = cargoCapacity;
    this.totalLoadCapacity = cargoCapacity + (peopleCapasity * 80);
  }

  @Override
  public int getTotalLoadCapacity() {
    return totalLoadCapacity;
  }

  @Override
  public int getPeopleCapacity() {
    return peopleCapacity;
  }
}
