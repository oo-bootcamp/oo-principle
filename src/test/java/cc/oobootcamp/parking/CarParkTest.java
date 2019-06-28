package cc.oobootcamp.parking;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.NoSuchElementException;
import java.util.UUID;
import org.junit.Test;

public class CarParkTest {

  @Test
  public void should_get_ticket_when_parking_a_car_given_parking_lot_IS_available() {
    CarPark carPark = new CarPark(5);
    Car car = new Car();

    Ticket result = carPark.parking(car);

    assertThat(result.getCarPlateNumber())
        .isEqualTo(car.getPlateNumber());
  }

  @Test
  public void should_get_cannot_park_message_when_parking_a_car_given_parking_lot_NOT_available() {
    CarPark carPark = new CarPark(
        5,
        new Car(), new Car(), new Car(), new Car(), new Car()
    );
    Car car = new Car();

    assertThatThrownBy(() -> carPark.parking(car))
        .isInstanceOf(IndexOutOfBoundsException.class)
        .hasMessage("The car park is full, cannot park your car.");
  }

  @Test
  public void should_get_the_car_matches_the_ticket_when_pick_up_the_car_given_the_ticket_IS_valid() {
    CarPark carPark = new CarPark(5);
    Car car = new Car();
    Ticket ticket = carPark.parking(car);

    Car result = carPark.pickUp(ticket);

    assertThat(result).isEqualTo(car);
  }

  @Test
  public void should_get_cannot_pick_message_when_pick_up_the_car_given_the_ticket_NOT_valid() {
    CarPark carPark = new CarPark(5);
    Ticket invalidTicket = new Ticket(UUID.randomUUID());

    assertThatThrownBy(() -> carPark.pickUp(invalidTicket))
        .isInstanceOf(NoSuchElementException.class)
        .hasMessage("Your ticket is invalid, cannot find your car in our park.");
  }
}
