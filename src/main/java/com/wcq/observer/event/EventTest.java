package com.wcq.observer.event;

public class EventTest {
    public static void main(String[] args) {
        try {
            MouseEventCallback callback = new MouseEventCallback();
            //注册事件
            Mouse mouse = new Mouse();
//            mouse.addLisenter(MouseEventType.ON_CLICK, callback);
            mouse.addLisenter(MouseEventType.ON_MOVE, callback);
            mouse.addLisenter(MouseEventType.ON_WHEEL, callback);
            mouse.addLisenter(MouseEventType.ON_OVER, callback);
            //调用方法
            mouse.click();
            mouse.move();
            //失焦事件
            mouse.blur();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
