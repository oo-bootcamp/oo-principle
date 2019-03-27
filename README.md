# OO Principle

[![Build Status](https://travis-ci.org/oo-bootcamp/oo-principle.svg?branch=master)](https://travis-ci.org/oo-bootcamp/oo-principle)
 

## 开发环境
 - JDK1.8+
 - JUnit 5


## 三大特性
### Length（封装）
1. 我需要一个Length来比较长度来判断是否能够交易，比如1跟1，2跟2，3跟3比较大小
2. 增加单位，相同单位进行比较，不同单位不比较，比如1m == 1m，10cm == 10cm，显示的时候也需要展示单位
3. 增加单位换算，支持换算比较，比如 1m = 100cm


### Rectangle（继承）
1. 有一个长方形，可以设置宽和高，也可以获取宽和高，可以求面积
2. 有一个正方形，可以设置宽和高，也可以获取宽和高，可以求面积
3. 有一个客户要改变长方形的宽，条件是：当宽小于或等于高的时候，就将宽加1，直到宽大于高的时候停止

### Bird（多态）
1. 有一只鸟，它可以飞，每飞一次，它离地面的高度就会增加一米。
2. 有一只企鹅，它也能飞，每飞行一次，它会向前进一米。


## SOLID
- S：Single Responsibility Principle
- O：Open/Close Principle
- L：Liskov Substitution Principle
- I：Interface Segregation Principle
- D：Dependency Inversion Principle

### 案例分析

#### SRP: Single Responsibility Principle
##### 需求1：客户需要一个字符串处理器，它能将固定日期格式的字符串（2019-01-19）去掉中间的符号-，还能统计非日期格式的字符串中的每个字符的出现次数，另外，该处理器还能将字符串的转换前后结果打印到控制台上

开发组设计了一个工具类，提供了`convert`和`print`两个方法，请编写一个`Client`类描述对该处理器的使用


##### 需求2：客户需要处理新的日期格式的字符串（19/01/2019），并且客户想把字符串处理器打印到文件上
请基于已有的功能，做出修改或扩展，完成该需求。


#### LSP: Liskow Substitution Principle

##### 需求1：客户需要一个长方形，能够给长方形设置宽和高，并且能够计算面积。

开发组设计了一个`Rectangle`类，有`setWidth`和`setHeight`方法，提供了能够一个`calculateArea`方法

##### 需求2：客户还需要一个正方形，同样能设置宽和高，计算面积
正方形是一个特殊的长方形，于是新建一个`Square`类，让其继承`Rectangle`类

##### 待解决的问题
这种设计存在坏味道，请你找出坏味道，并分析原因，给出你们的设计方案？


#### ISP: Interface Segregation Principle
##### 需求1：客户需要一个程序来记录人类的活动，该客户的服务目标群体是8个月左右的婴儿，需要具备如下行为：爬行、吃饭、喝水、哭闹、打盹
开发组设计了一个interface `HumanAble`，包含了上述5个方法，并在`BabyClient`类中描述了使用方式。

##### 需求2：客户为了细分市场，需要对30岁的成年人做记录，需要具备如下行为：吃饭、喝水、打盹、汇报、工作
请你基于之前的设计进行修改或扩展，完成客户的新需求，并在`AdultClient`类中描述使用方式。


#### DIP: Dependency Inversion Principle
##### 需求1：客户需要一个账单结算程序，改程序能够把商品条目进行普通格式化，并通过普通打印器打印出来。
开发组已经设计了`Item`和`OrderReceiptHandler`类，并且在`OrderReceiptHandler`中使用了使用了普通格式的打印器`PlaintPrinter`进行打印

##### 需求2：客户收到顾客的反馈，账单格式化需要XML形式
请你设计一个新的XML打印器来满足客户需求，你可以基于原来的程序进行修改或扩展。

##### 需求3：客户收到顾客的反馈，账单格式化需要HTML形式
请你设计一个新的HTML打印器来满足客户需求，你可以基于原来的程序进行修改或扩展。




## 参考资料
- [JUnit 5用户指南](https://sjyuan.cc/junit5/user-guide-cn/)
- [Gradle 用户指南](https://docs.gradle.org/current/userguide/userguide.html)