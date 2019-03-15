package com.wcq.adapter.objectadapter;

import com.wcq.adapter.ThreeSlotExample;
import com.wcq.adapter.TwoSlot;

/**
 *  对象适配器模式：
 *      需求：在接口TwoSlot中适配ThreeSlot接口中的方法
 *      通过ObjectAdapter类去实现TwoSlot接口，这样就拥有了TwoSlot接口中的方法实现，然后在ObjectAdapter类中
 *      定义一个私有的ThreeSlot接口的实例，通过带参构造进行传入，
 *      最后在TwoSlot接口中的方法实现中通过私有的ThreeSlot接口的实例调用其内的方法
 */
public class ObjectAdapter implements TwoSlot {
    private ThreeSlotExample threeSlotExample;
    public ObjectAdapter(ThreeSlotExample threeSlotExample){
        this.threeSlotExample = threeSlotExample;
    }
    @Override
    public void isTwoSlot() {
        threeSlotExample.isThreeSlot();
    }
}
