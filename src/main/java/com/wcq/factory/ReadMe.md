#设计模式之工厂模式

##简介
工厂模式分三种：简单工厂模式，工厂方法模式，抽象工厂模式
简单工厂模式：由一个工厂对象决定创建哪种产品类的实例 (Calendar 类)（适用于创建对象较少的情景下，且客户端需传入对应产品类的参数）容易出错，且修改麻烦，违背开闭原则。
工厂方法模式：定义一个工厂接口，让它的实现类来决定创建哪种产品类，使产品的创建延迟到实现类中 。一个工厂实现对象产生一种产品类
            （在工厂方法模式中用户只需要关心所需产品对应的工厂，无须关心创建细节，而且加入新的产品符合开闭原则。） 
            单一职责原则，专人专事。
            主要解决产品扩展的问题。当时随着产品增多，类的数量也变得多了起来，是系统不好维护。
            工厂方法适用于以下场景：
                1、创建对象需要大量重复的代码。
                2、客户端（应用层）不依赖于产品类实例如何被创建、实现等细节。
                3、一个类通过其子类来指定创建哪个对象。
            工厂方法也有缺点：
                1、类的个数容易过多，增加复杂度。
                2、增加了系统的抽象性和理解难度。
抽象工厂模式：创建一系列相关对象的接口，无需指定他们具体的类。 客户端（应用层）不依赖于产品类实例如何
           被创建、实现等细节，强调的是一系列相关的产品对象（属于同一产品族）一起使用
           创建对象需要大量重复的代码。需要提供一个产品类的库，所有的产品以同样的接口
           出现，从而使客户端不依赖于具体实现 。   
           工厂也是有缺点的：
               1、规定了所有可能被创建的产品集合，产品族中扩展新的产品困难，需要修改抽象工
               厂的接口。
               2、增加了系统的抽象性和理解难度。
               但在实际应用中，我们千万不能犯强迫症甚至有洁癖。在实际需求中产品等级结构升
               级是非常正常的一件事情。我们可以根据实际情况，只要不是频繁升级，可以不遵循
               开闭原则。   
##产品族与产品等级
    产品族如一个产品的大品牌 如格力下有空调 冰箱等产品，此时的格力就是一个产品族，而具体的冰箱，空调在不同品牌下就成了产品等级。

