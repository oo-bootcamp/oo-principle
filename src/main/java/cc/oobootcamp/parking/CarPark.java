package cc.oobootcamp.parking;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.UUID;

public class CarPark {

  private int parkSize;
  private Map<UUID, Car> lots;

  public CarPark(int parkSize) {
    this.parkSize = parkSize;
    this.lots = new HashMap<>(parkSize);
  }

  public CarPark(int parkSize, Car... existingCars) {
    this.parkSize = parkSize;
    this.lots = new HashMap<>();
    for (Car car : existingCars) {
      lots.put(car.getPlateNumber(), car);
    }
  }

  public Ticket parking(Car car) {
    if (lots.size() < parkSize) {
      lots.put(car.getPlateNumber(), car);
      return new Ticket(car.getPlateNumber());
    }
    throw new IndexOutOfBoundsException("The car park is full, cannot park your car.");
  }

  public Car pickUp(Ticket ticket) {
    UUID carPlateNumber = ticket.getCarPlateNumber();
    if (lots.containsKey(carPlateNumber)) {
      return lots.remove(carPlateNumber);
    }
    throw new NoSuchElementException("Your ticket is invalid, cannot find your car in our park.");
  }
}
