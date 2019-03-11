package com.wcq.singleton.full;

/**
 * 设计模式之单例模式：
 *      饱汉式
 *      优点：起到了lazy loading的效果
 *      缺点：
 */
public class FullThree {
    private static FullThree hungryOne = null;
    private FullThree(){}
    //摒弃同步方法 改为同步 产生实例化的代码块 但此方法并不能起到线程同步的效果：
    // 若走至if(hungryOne==null)，在还未来的及往下走的时候，另一线程也走至此，并通过了该判断，就会出现多个单例矛盾
    public static FullThree getInstance(){
        if(hungryOne==null){
            synchronized (FullThree.class){
                hungryOne = new FullThree();
            }
        }
        return hungryOne;
    }
}
