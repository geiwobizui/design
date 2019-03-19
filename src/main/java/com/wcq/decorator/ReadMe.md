#设计模式之装饰者模式（Decorator Pattern）

##简介
装饰者模式 是指在不改变原有对象的基础之上，将功能附加到对象上，提供了比继承更有弹性的替代方案（扩展原有对象的功能）。
        属于结构性模式
##应用场景
* 扩展某个类的功能或为类添加附加职责
* 动态给类添加功能，并能在不改变类的情况下动态的撤销这些功能

##对比
            装饰者模式                               适配器模式
 形式     是一种特别的适配器模式，但有层级关系         没有层级关系
 定义     装饰者和被装饰者需要实现同一个接口，         适配者和被适配者没有必然联系，
         目的：为了装饰后依旧保留OOP关系             通常用继承和代理的形式实现
 关系     is-a                                  has-a
 功能     注重覆盖、扩展                           注重兼容、转换
 设计     前置考虑                                置后考虑
 
##优缺点
优点：
* 是继承的有力补充，比继承灵活，可以再不改变原有对象的情况下动态的扩展它
* 使用不同装饰类进行排列组合，实现不同的效果
* 遵循开闭原则
缺点：
* 会出现更多代码，更多类，增加程序复杂度
* 动态装饰时，多层装饰会更复杂

##应用
JDK 中的IO相关类
Spring 中的 TransactionAwareCacheDecorator 事务缓存处理装饰