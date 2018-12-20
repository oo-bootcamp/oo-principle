# OO Principle

[![Build Status](https://travis-ci.org/oo-bootcamp/oo-principle.svg?branch=master)](https://travis-ci.org/oo-bootcamp/oo-principle)
 

## 开发环境
 - JDK1.8+
 - JUnit 5


## SOLID
- S：Single Responsibility Principle
- O：Open/Close Principle
- L：Liskov Substitution Principle
- I：Interface Segregation Principle
- D：Dependency Inversion Principle



## 用户故事
### Length（封装）
1. 我需要一个Length来比较长度来判断是否能够交易，比如1跟1，2跟2，3跟3比较大小
2. 增加单位，相同单位进行比较，不同单位不比较，比如1m == 1m，10cm == 10cm，显示的时候也需要展示单位
3. 增加单位换算，支持换算比较，比如 1m = 100cm


### Retangle（继承）
1. 有一个长方形，可以设置宽和高，也可以获取宽和高，可以求面积
2. 有一个正方形，可以设置宽和高，也可以获取宽和高，可以求面积
3. 有一个客户要改变长方形的宽，条件是：当宽小于或等于高的时候，就将宽加1，直到宽大于高的时候停止

### Bird（多态）
1. 有一只鸟，它可以飞，每飞一次，它离地面的高度就会增加一米。
2. 有一只企鹅，它也能飞，每飞行一次，它会像前进一米。


## 参考资料
- [JUnit 5用户指南](https://sjyuan.cc/junit5/user-guide-cn/)
- [Gradle 用户指南](https://docs.gradle.org/current/userguide/userguide.html)