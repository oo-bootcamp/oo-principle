package cc.oobootcamp.parking;

import java.util.List;

public class ParkingBoy {

  private List<ParkingLot> parkingLots;

  public ParkingBoy(List<ParkingLot> parkingLots) {
    this.parkingLots = parkingLots;
  }

  public Ticket park(Car car) {
    return parkingLots.stream()
        .filter(ParkingLot::hasAvailableLots)
        .findFirst()
        .map(parkingLot -> parkingLot.park(car))
        .orElseThrow(ParkingLotIsFullException::new);
  }

  public Car pick(Ticket ticket) {
    return parkingLots.stream()
        .filter(parkingLot -> parkingLot.isValidTicket(ticket))
        .findFirst()
        .map(parkingLot -> parkingLot.pick(ticket))
        .orElseThrow(InvalidTicketException::new);
  }
}
