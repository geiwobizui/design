package com.wcq.observer.gupao;

/**
 * 定义被观察者 GPer类 继承了 Observable 内置一个用于发布被观察信息的方法 每调用一次
 *                  就执行一次setChanged 进行一个change状态的设置
 *                  同样要执行一个通知/布告被观察信息的方法notifyObservers(Object arg) 内部调用了
 *                  Observer接口的 update(Observable o,Object obj)
 *        所以 要定义一些（Teacher）观察者去观察GPer类 即实现 Observer 定义 Observer接口中的 update(Observable o,Object obj) 方法在其中构建逻辑
 * 观察者模式的使用： 先创建观察者和被观察者两个实例，用GPer类调用其父类的addObserver（Observer o）用于添加要通知的观察者，然后在调用发布方法
 */
public class GPerObserverTest {
    public static void main(String[] args) {
        GPer gPer = GPer.getInstance();
        Teacher wcq = new Teacher("wcq");
        gPer.addObserver(wcq);
        gPer.publicMsg(new Question("涛涛","Redis实现原理"));
    }
}
