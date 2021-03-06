#设计模式之原型模式

##简介
原型模式是 用原型实例指定对象的种类，并通过拷贝这些原型 创建出新的对象。

##基本实现思路
 JSON.parseObject()
 深克隆 也是听过重写克隆方法，在其中通过序列化和反序列化的方式进行新对象的产生的
 浅克隆 重写克隆方法 clone() 在其中通过set方法产生新的对象 此时两对象的地址不同，
       但是此时对象中的引用类型对象的地址是一样的

##克隆会破坏单例模式
如果我们克隆的目标的对象是单例对象，那意味着，深克隆就会破坏单例。实际上防止
克隆破坏单例解决思路非常简单，禁止深克隆便可。要么你我们的单例类不实现
Cloneable 接口；要么我们重写clone()方法，在clone 方法中返回单例对象即可

##适用场合
* 类初始化消耗资源较多。
* new 产生的一个对象需要非常繁琐的过程（数据准备、访问权限等）
* 构造函数比较复杂。
* 循环体中生产大量对象时。

