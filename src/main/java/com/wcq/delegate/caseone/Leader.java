package com.wcq.delegate.caseone;

import java.util.HashMap;
import java.util.Map;

/**
 * 进行任务分配调度
 */
public class Leader {
    private static Map<String,Employee> handerMapping = new HashMap<>();
    static {
        handerMapping.put("PACHONG",new EmployeeA());
        handerMapping.put("HEIKE",new EmployeeB());
    }
    public void excute(String commond){
        if(handerMapping.containsKey(commond)){
           handerMapping.get(commond).excute(commond);
        }else{
            System.out.println("未找到对应的处理对象");
        }
    }
}
