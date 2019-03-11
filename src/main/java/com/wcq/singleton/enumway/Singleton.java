package com.wcq.singleton.enumway;

/**
 * 借助于jdk 1.5+枚举来实现单例，不仅实现了线程安全，还能防止反序列化重新创建新的对象
 */
public enum Singleton {
    INSTANCE;
    public void whateverMethod() {

    }
}
