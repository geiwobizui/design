#设计模式之策略模式（Strategy Pattern）

##简介
策略模式 是指 定义了算法家族、 分别封装起来，让他们可以相互替换，此模式让算法的变化不会影响到使用算法的用户

##应用场景
* 若系统中有很多类，并且其区别仅仅在于他们的行为不同
* 一个系统需要动态地在几种算法中选择一种

##案列
优惠策略案例：
    PromotionWay接口（优惠方法的接口） 实现类有 A、B、C 提供了三种优惠策略
    PromotionActivity类 优惠活动实施（选择） 内持有PromotionWay的实现，并拥有一个执行优惠的方法
        void execute(){promotionWay.executePromotion();}
    为了更符合实际情况，我们用工厂模式+注册单例模式来优化
    PromotionFactory 类 通过优惠key到map中取对应优惠方法类实例
    此时每次上新的活动时，都不会影响原来的代码
支付策略案例：
    Order订单类 其中有订单号、uid及订单金额  拥有pay()方法和pay(uid) 用于调用支付策略（PayStrategy）选择支付方式，用选择的支付方式支付 并生成支付信息类（Message）打印出来
    Message信息类 其中有code（支付状态）、data（支付金额）、result（支付结果）
    抽象类 Pay 内置 获取abstract支付类型 、abstract查询余额 、扣款支付三种方法 扣款支付方法是Message pay（String uid，double amount）由于此方法是公用的方法并进行余额的检测，所以不需要抽象
        其他的类只要继承此类就行了
    支付策略（PayStrategy）是一个工厂+注册单例来实现的
JDK中的体现：
    比较器Comparator接口  中的 Compare（）方法 此比较器下有非常多的实现类 ，常用Comparator作为参数传入作为排序策略 如Arrays类的parallelSort方法
        public interface Comparator<T>{         public class Arrays{
            int compare(T o1,T o2);                 public static <T> void parallelSort(T[] a, int fromIndex, int toIndex,Comparator<? super T> cmp) {}
        }                                       }
    TreeMap的构造方法；
Spring中的体现：
    Resource类的多种实现策略如（AbstractResource、ByteArrayResource等）
    策略之间还可以有继承关系（如InstantiationStrategy顶层的策略抽象非常简单，但是它下面有两种策略SimpleInstantiationStrategy 和CglibSubclassingInstantiationStrategy）
        SimpleInstantiationStrategy 就是被 CglibSubclassingInstantiationStrategy 继承

##策略模式优缺点
优点：
* 符合开闭原则
* 避免了使用多重条件转移语句（if else 和 switch ）
* 提高了算法的保密性和安全性
缺点：
* 客户端必须知道所有的策略，并能够自行决定使用哪种策略
* 策略类多了，会增加维护难度
