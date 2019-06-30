package cc.oobootcamp.parking;

public class InvalidTicketException extends RuntimeException {

  InvalidTicketException() {
    super("Your ticket is invalid, cannot find your car in our park.");
  }
}
