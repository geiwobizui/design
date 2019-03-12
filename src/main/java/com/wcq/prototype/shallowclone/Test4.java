package com.wcq.prototype.shallowclone;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        CloneEntity cloneEntity = new CloneEntity();
        cloneEntity.setA("hh");
        cloneEntity.setB(12);
        List<String> s = new ArrayList<>();
        s.add("kk");
        cloneEntity.setList(s);
        Client client = new Client();
        CloneEntity prototype = (CloneEntity)client.showClone(cloneEntity);
        System.out.println("原："+cloneEntity.toString());
        System.out.println("后："+prototype.toString());
        System.out.println("原："+cloneEntity.getList());
        System.out.println("后："+prototype.getList());
        System.out.println(cloneEntity.getList()==prototype.getList());
    }

}
