package com.wcq.adapter.interfaceadapter;

/**
 * 接口适配器模式：
 *      需求：想只实现某接口中的部分方法
 *      用一个抽象类实现接口，在通过适配类InterfaceAdapter去继承此抽象类，这样就可以有选择的去重写接口中的方法了
 */
public class InterfaceAdapter extends AllMethodAbstract{
    @Override
    public void a() {
        System.out.println("方法A");
    }

    @Override
    public void b() {
        System.out.println("方法B");
    }

}
