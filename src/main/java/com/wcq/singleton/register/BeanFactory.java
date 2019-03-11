package com.wcq.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * spring中的做法，就是用这种注册单例
 */
public class BeanFactory {
    //线程安全
    private static Map<String,Object> ioc = new ConcurrentHashMap<>();
    private BeanFactory(){}
    public static Object getBean(String classname){
        if(!ioc.containsKey(classname)){
            Object obj = null;
            try {
                obj = Class.forName(classname).newInstance();
                ioc.put(classname,obj);
            }catch (Exception e){
                e.printStackTrace();
            }
            return obj;
        }else{
            return ioc.get(classname);
        }
    }
}
