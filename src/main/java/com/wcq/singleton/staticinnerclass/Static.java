package com.wcq.singleton.staticinnerclass;

/**
 * 此方式跟饿汉方式采用机制类似，但又有不同：
 *      两种方式通过类加载机制保证初始化实例时只有一个线程
 *      饿汉：在类加载的时候就进行了实例化；而静态内部类，类被装载的时候不会立即被实例化，
 *           在需要是调用getInstance()才会装载内部类，从而被实例化出来
 *           类的静态属性只会在第一次加载类的时候初始化，所以这里，JVM帮我们保证了线程安全，在类进行初始化时，别的线程无法进入
 *      有点：线程安全，延迟加载，效率高
 */
public class Static {
    private Static(){}
    //静态内部内的方式（推荐使用）
    private static class Static_inner{
        private static final Static staticInner = new Static();
    }
    public static Static getInstance(){
        return Static_inner.staticInner;
    }
}
