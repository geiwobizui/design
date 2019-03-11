package com.wcq.singleton.full;

/**
 * 设计模式之单例模式：
 *      饱汉式
 *      优点：起到了lazy loading的效果，线程安全，延迟加载，效率高
 *      缺点：
 */
public class FullFour {
    private static FullFour hungryOne = null;
    private FullFour(){}
    //双重检测（推荐使用）
    //进行两次检侧if(hungryOne==null)保证线程安全
    //此时实例化只进行了一次，后面的直接return就行了
    public static FullFour getInstance(){
        if(hungryOne==null){
            synchronized (FullFour.class){
                if(hungryOne==null) {
                    hungryOne = new FullFour();
                }
            }
        }
        return hungryOne;
    }
}
