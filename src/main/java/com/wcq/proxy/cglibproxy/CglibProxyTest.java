package com.wcq.proxy.cglibproxy;

import com.wcq.proxy.Person;
import com.wcq.proxy.Student;
import net.sf.cglib.core.DebuggingClassWriter;

public class CglibProxyTest {
    public static void main(String[] args) {
        //利用cglib代理类将内存中的生成的字节码文件序列化到磁盘查看
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"D:\\workspace\\design\\out\\production\\classes\\com\\wcq\\proxy\\cglibproxy");
        Person instance =(Person) new CglibAgency().getInstance(Student.class);
        instance.learn();
    }
}
