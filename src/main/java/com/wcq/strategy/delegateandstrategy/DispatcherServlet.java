package com.wcq.strategy.delegateandstrategy;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 分发任务调度 接收到request请求 进行解析得到请求 的uri 以及 请求参数列表parameter
 * 根据uri去知道到对应的Controller
 * 此处用到了策略模式和委派模式
 * 委派模式：即前段的所有请求委派给DispatcherServlet进行分发调度
 * 策略模式：是结合注册单例，用不同的uri最为Controller策略的选择内容，此处用Handler对象存储用于匹配的Controller，uri，method的对应关系，
 *      循环list中的handler的uri去匹配请求中的uri拿到Controller，用反射的去调用方法执行
 */
public class DispatcherServlet extends HttpServlet {
    private static List<Handler> list = new ArrayList<Handler>();
    //将各个不同的策略初始化到策略容器中
    public void init(){
        Class<?> aClazz = AController.class;
        Class<?> bClazz = BController.class;
        Class<?> cClazz = CController.class;

        try {
            try {
                list.add(new Handler().setController(aClazz.newInstance())
                        .setMethod(aClazz.getMethod("getA",new Class[]{String.class})).setURI("getA.json"));
                list.add(new Handler().setController(aClazz.newInstance())
                        .setMethod(bClazz.getMethod("getB",new Class[]{String.class})).setURI("getB.json"));
                list.add(new Handler().setController(aClazz.newInstance())
                        .setMethod(cClazz.getMethod("getC",new Class[]{String.class})).setURI("getC.json"));

            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public void doDispatcher(HttpServletRequest req, HttpServletResponse resp) throws IOException, InvocationTargetException, IllegalAccessException {
        String requestURI = req.getRequestURI();
        String mid = req.getParameter("mid");
        //优雅的修改这段代码
//        if("getA".equals(requestURI)){
//            new AController().getA(mid);
//        }else if("getB".equals(requestURI)){
//            new BController().getB(mid);
//        }else if("getC".equals(requestURI)){
//            new CController().getC();
//        }else {
//            resp.getWriter().write("404 Not Found!!");
//        }
        Handler handler=null;
        for(Handler h:list){
            if(h.getURI().equals(requestURI)){
                handler=h;
                break;
            }
        }

        Object o = handler.getMethod().invoke(handler.getController(), mid);

    }
    protected void service(HttpServletRequest req, HttpServletResponse resp){
        try {
            doDispatcher(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    class Handler{
        private Object controller;
        private String URI;
        private Method method;

        public Object getController() {
            return controller;
        }

        public Handler setController(Object controller) {
            this.controller = controller;
            return this;
        }

        public String getURI() {
            return URI;
        }

        public Handler setURI(String URI) {
            this.URI = URI;
            return this;
        }

        public Method getMethod() {
            return method;
        }

        public Handler setMethod(Method method) {
            this.method = method;
            return this;
        }
    }
}
