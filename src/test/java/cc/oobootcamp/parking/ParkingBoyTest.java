package cc.oobootcamp.parking;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.Arrays;
import org.junit.Test;

public class ParkingBoyTest {
  // TODO 测试分层, E2E/UT/Integration

  @Test
  public void should_return_a_valid_ticket_when_park_a_car_into_given_2_car_parks_both_have_available_lots() {
    ParkingLot fistParkingLot = new ParkingLot(2);
    ParkingLot secondParkingLot = new ParkingLot(2);
    ParkingBoy parkingBoy = new ParkingBoy(
        Arrays.asList(fistParkingLot, secondParkingLot)
    );
    Car car = new Car();

    Ticket ticket = parkingBoy.park(car);

    assertThat(ticket).isNotNull();
    /*
    fistParkingLot.pick(ticket) is not null
    secondParkingLot.pick(ticket) is null
    */
    assertThat(fistParkingLot.isParkedCar(car)).isTrue();
    assertThat(secondParkingLot.isParkedCar(car)).isFalse();
  }

  @Test
  public void should_return_valid_ticket_when_park_a_car_given_2_car_parks_first_full_second_with_available_lots() {
    ParkingLot fistParkingLot = buildAFullCarPark();
    ParkingLot secondParkingLot = new ParkingLot(2);
    ParkingBoy parkingBoy = new ParkingBoy(
        Arrays.asList(fistParkingLot, secondParkingLot)
    );
    Car car = new Car();

    Ticket ticket = parkingBoy.park(car);

    assertThat(ticket).isNotNull();
    assertThat(fistParkingLot.isParkedCar(car)).isFalse();
    assertThat(secondParkingLot.isParkedCar(car)).isTrue();
  }

  @Test
  public void should_get_cannot_park_message_when_park_a_car_given_2_car_parks_both_full() {
    ParkingLot fistParkingLot = buildAFullCarPark();
    ParkingLot secondParkingLot = buildAFullCarPark();
    ParkingBoy parkingBoy = new ParkingBoy(
        Arrays.asList(fistParkingLot, secondParkingLot)
    );
    Car car = new Car();

    assertThatThrownBy(() -> parkingBoy.park(car))
        .isInstanceOf(ParkingLotIsFullException.class)
        .hasMessage("All car park are full, cannot park your car.");
  }

  @Test
  public void should_get_the_car_when_pick_a_car_with_valid_ticket_given_2_car_parks_parked_related_car() {
    ParkingLot fistParkingLot = buildAFullCarPark();
    ParkingLot secondParkingLot = new ParkingLot(2);
    ParkingBoy parkingBoy = new ParkingBoy(
        Arrays.asList(fistParkingLot, secondParkingLot)
    );
    Car myCar = new Car();
    Ticket myTicket = parkingBoy.park(myCar);

    Car pickedCar = parkingBoy.pick(myTicket);

    assertThat(pickedCar).isEqualTo(myCar);
  }

  @Test
  public void should_get_cannot_pick_message_when_pick_a_car_with_invalid_ticket_given_2_car_parks() {
    ParkingLot fistParkingLot = buildAFullCarPark();
    ParkingLot secondParkingLot = new ParkingLot(2);
    ParkingBoy parkingBoy = new ParkingBoy(
        Arrays.asList(fistParkingLot, secondParkingLot)
    );

    assertThatThrownBy(() -> parkingBoy.pick(new Ticket()))
        .isInstanceOf(InvalidTicketException.class)
        .hasMessage("Your ticket is invalid, cannot find your car in our park.");
  }

  @Test
  public void should_return_ticket_when_park_a_car_given_first_car_park_full_but_picked_a_car_just_now_and_second_with_available_lots() {
    ParkingLot fistParkingLot = new ParkingLot(1);
    Ticket someTicket = fistParkingLot.park(new Car());
    ParkingLot secondParkingLot = new ParkingLot(2);
    ParkingBoy parkingBoy = new ParkingBoy(
        Arrays.asList(fistParkingLot, secondParkingLot)
    );
    parkingBoy.pick(someTicket);
    Car car = new Car();

    Ticket ticket = parkingBoy.park(car);

    assertThat(ticket).isNotNull();
    assertThat(fistParkingLot.isParkedCar(car)).isTrue();
    assertThat(secondParkingLot.isParkedCar(car)).isFalse();
  }

  private ParkingLot buildAFullCarPark() {
    return new ParkingLot(1, new Car());
  }
}
