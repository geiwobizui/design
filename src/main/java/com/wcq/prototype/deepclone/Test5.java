package com.wcq.prototype.deepclone;

public class Test5 {
    public static void main(String[] args) {
        MaYun maYun = new MaYun();
        try {
            MaYun o = (MaYun)maYun.clone();
            System.out.println("deep:"+(maYun.company==o.company));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        MaYun o1 = (MaYun)maYun.shallowClone(maYun);
        System.out.println("shallow:"+(maYun.company==o1.company));


    }
}
