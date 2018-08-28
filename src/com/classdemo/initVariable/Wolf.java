package com.classdemo.initVariable;

/**
 * Created by jibingbing on 2017/12/7.
 */
public class Wolf extends Animal {
    {
        System.out.println("Wolf 的非静态初始化块");
    }

    public Wolf() {
        super("灰太狼",3);
        System.out.println("Wolf 的无参构造器");
    }

    public Wolf(double weight) {
        this();
        System.out.println("Wolf 带weight参数的构造器,weight参数:" + weight);
    }
}
