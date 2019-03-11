package com.wcq.singleton.full;

/**
 * 设计模式之单例模式：
 *      饱汉式
 *      优点：起到了lazy loading的效果 并解决了线程同步问题
 *      缺点：但是每个线程都要进行一个获得锁的过程，效率低（其实在单例中这个同步锁只要进行一次就可以了，后面想获得实例，直接return就好了）
 *              所以方法上加同步需要改进
 */
public class FullTwo {
    private static FullTwo hungryOne = null;
    private FullTwo(){}
    //加入一个同步锁   线程安全 同步方法（不推荐）
    public static synchronized FullTwo getInstance(){
        if(hungryOne==null){
            hungryOne = new FullTwo();
        }
        return hungryOne;
    }
}
