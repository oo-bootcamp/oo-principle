package cc.oobootcamp.parking;

import java.util.UUID;

public class Car {

  private UUID plateNumber;

  public Car() {
    this.plateNumber = UUID.randomUUID();
  }

  public UUID getPlateNumber() {
    return plateNumber;
  }
}
