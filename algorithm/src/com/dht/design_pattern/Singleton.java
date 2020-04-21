package com.dht.design_pattern;

/**
 * @Author: dht
 */

/**
 * 单例模式
 */
public class Singleton {

    // 添加volatile关键字：保证该属性的可见性；防止指令重排
    private volatile static Singleton instance = null;

    // 构造器私有化
    private Singleton() {
    }

    // 获取实例方法
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
