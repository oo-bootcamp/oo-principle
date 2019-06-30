package cc.oobootcamp.parking;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {

  private int parkSize;
  private Map<Ticket, Car> lots;

  public ParkingLot(int parkSize) {
    this.parkSize = parkSize;
    this.lots = new HashMap<>(parkSize);
  }

  public ParkingLot(int parkSize, Car... existingCars) {
    this.parkSize = parkSize;
    this.lots = new HashMap<>();
    for (Car car : existingCars) {
      lots.put(new Ticket(car), car);
    }
  }

  public Ticket park(Car car) {
    if (lots.size() < parkSize) {
      Ticket ticket = new Ticket(car);
      lots.put(ticket, car);
      return ticket;
    }
    throw new ParkingLotIsFullException();
  }

  public Car pick(Ticket ticket) {
    if (isValidTicket(ticket)) {
      return lots.remove(ticket);
    }
    throw new InvalidTicketException();
  }

  boolean isValidTicket(Ticket ticket) {
    return lots.containsKey(ticket);
  }

  public boolean isParkedCar(Car car) {
    return lots.containsValue(car);
  }

  boolean hasAvailableLots() {
    return (parkSize - lots.size())>0;
  }

}
