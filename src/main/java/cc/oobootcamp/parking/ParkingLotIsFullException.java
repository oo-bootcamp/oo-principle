package cc.oobootcamp.parking;

public class ParkingLotIsFullException extends RuntimeException {

  ParkingLotIsFullException() {
    super("All car park are full, cannot park your car.");
  }
}
