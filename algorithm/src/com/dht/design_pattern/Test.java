package com.dht.design_pattern;

/**
 * @Author: dht
 */
public class Test {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.getField();
    }
}
