parks 多个停车场
car 车
ticket 票

one park is filled 其中一个停满
all park are filled 都停满
parking 按顺序停车
leaving 取车


## Tasking

### park
**Given** (ParkingPlatform管理的)有两个有空位的停车场
**When** 停一辆车
**Then** 成功停到第一个停车场, 返回停车票

**Given** 有两个停车场, 第一个停满了
**When** 停一辆车
**Then** 成功停到第二个有空位的停车场, 返回停车票

**Given** 有两个没有空位的停车场
**When** 停一辆车
**Then** 得到"没有空位, 停车失败"的信息

### pick
**Given** 有两个停车场和已停好的车
**When** 使用有效的停车票取一辆车
**Then** 成功取到对应的车

**Given** 有两个停车场和已停好的车
**When** 使用无效的停车票取一辆车
**Then** 得到"车票无效, 取车失败"的信息

### pick then park
**Given** 有两个停车场, 第一个停满了, 取走第一个停车场的车
**When** 停一辆车
**Then** 成功停到第一个停车场, 返回停车票

