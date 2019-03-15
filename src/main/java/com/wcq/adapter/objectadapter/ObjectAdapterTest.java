package com.wcq.adapter.objectadapter;

import com.wcq.adapter.ThreeSlotExample;

public class ObjectAdapterTest {
    public static void main(String[] args) {
        new ObjectAdapter(new ThreeSlotExample()).isTwoSlot();
    }
}
