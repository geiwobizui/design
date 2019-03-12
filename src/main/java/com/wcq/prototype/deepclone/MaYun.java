package com.wcq.prototype.deepclone;

import java.io.*;

public class MaYun extends Person implements Cloneable, Serializable {
    public Company company;
    public MaYun(){
        this.company=new Company();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    public Object deepClone() {
        try {
            //通过序列化与反序列化的方式进行深度克隆
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();//可以捕获内存缓冲区的数据，转换成字节数组
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);//对象的输出流
            objectOutputStream.writeObject(this);

            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());//可以将字节数组转化为输入流 。
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);//对象的输入流:  ObjectInputStream
            MaYun maYun = (MaYun)objectInputStream.readObject();
            return maYun;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Object shallowClone(MaYun target){
        MaYun maYun = new MaYun();
        maYun.age=target.age;
        maYun.name=target.name;
        maYun.company=target.company;
        return maYun;
    }
}
