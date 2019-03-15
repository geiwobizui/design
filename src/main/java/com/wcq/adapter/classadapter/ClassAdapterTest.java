package com.wcq.adapter.classadapter;

/**
 * 类适配器模式：
 *      需求：适配接口TwoSlot使其能够使用接口ThreeSlot中的方法
 *      通过ClassAdapter类去实现TwoSlot的方法并继承ThreeSlot的实现类，在ClassAdapter的方法中调用ThreeSlot实现类所实现的方法
 *      即通过继承和实现的方式 实现接口的适配
 */
public class ClassAdapterTest {
    public static void main(String[] args) {
        new ClassAdapter().isTwoSlot();
    }
}
