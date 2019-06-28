park 停车场
car 车
park is filled 停满
ticket 票
parking 停车
leaving 取车

## Tasking

### park
**Given** a park with some lots
**When** load car park into the system with the number of park lots
**Then** get an correct sized empty park in system



### parking 停车
**Given** parking lot is available
**When** parking a car
**Then** get ticket

**Given** a parking is filled
**When** parking a car
**Then** tell user parking is filled

### leaving 取车
**Given** a ticket of the park
**When** pick up the car with the ticket
**Then** get the car matches to the ticket

**Given** an invalid ticket
**When** pick up the car with the ticket
**Then** tell user ticket is invalid

