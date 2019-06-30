package cc.oobootcamp.parking;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.Test;

public class ParkingLotTest {

  @Test
  public void should_get_ticket_when_parking_a_car_given_parking_lot_IS_available() {
    ParkingLot parkingLot = new ParkingLot(5);
    Car car = new Car();

    Ticket result = parkingLot.park(car);

    assertThat(result).isNotNull();
  }

  @Test
  public void should_get_cannot_park_message_when_parking_a_car_given_parking_lot_NOT_available() {
    ParkingLot parkingLot = new ParkingLot(
        5,
        new Car(), new Car(), new Car(), new Car(), new Car()
    );
    Car car = new Car();

    assertThatThrownBy(() -> parkingLot.park(car))
        .isInstanceOf(ParkingLotIsFullException.class)
        .hasMessage("All car park are full, cannot park your car.");
  }

  @Test
  public void should_get_the_car_matches_the_ticket_when_pick_up_the_car_given_the_ticket_IS_valid() {
    ParkingLot parkingLot = new ParkingLot(5);
    Car car = new Car();
    Ticket ticket = parkingLot.park(car);

    Car result = parkingLot.pick(ticket);

    assertThat(result).isEqualTo(car);
  }

  @Test
  public void should_get_cannot_pick_message_when_pick_up_the_car_given_the_ticket_NOT_valid() {
    ParkingLot parkingLot = new ParkingLot(5);
    Ticket invalidTicket = new Ticket();

    assertThatThrownBy(() -> parkingLot.pick(invalidTicket))
        .isInstanceOf(InvalidTicketException.class)
        .hasMessage("Your ticket is invalid, cannot find your car in our park.");
  }

  @Test
  public void should_get_cannot_pick_message_when_pick_up_the_car_given_the_ticket_IS_already_used() {
    ParkingLot parkingLot = new ParkingLot(5);
    Car car = new Car();
    Ticket ticket = parkingLot.park(car);

    Car result = parkingLot.pick(ticket);
    assertThat(result).isEqualTo(car);

    assertThatThrownBy(() -> parkingLot.pick(ticket))
        .isInstanceOf(InvalidTicketException.class)
        .hasMessage("Your ticket is invalid, cannot find your car in our park.");
  }
}
