package com.wcq.adapter.classadapter;

import com.wcq.adapter.ThreeSlotExample;
import com.wcq.adapter.TwoSlot;

public class ClassAdapter extends ThreeSlotExample implements TwoSlot {
    @Override
    public void isTwoSlot() {
        super.isThreeSlot();
    }
}
