package cc.oobootcamp.parking;

import java.util.UUID;

public class Ticket {

  private UUID carPlateNumber;

  public Ticket(UUID plateNumber) {
    carPlateNumber = plateNumber;
  }

  public UUID getCarPlateNumber() {
    return carPlateNumber;
  }
}
