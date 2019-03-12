package com.wcq.prototype.shallowclone;

import java.util.ArrayList;
import java.util.List;

public class CloneEntity implements Prototype{
    private String a;
    private int    b;
    private List list=new ArrayList<String>();

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    @Override
    public Prototype clone() {
        CloneEntity cloneEntity = new CloneEntity();
        cloneEntity.setA(this.a);
        cloneEntity.setB(this.b);
        cloneEntity.setList(this.list);
        return cloneEntity;
    }
}
