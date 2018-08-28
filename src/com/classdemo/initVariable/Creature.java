package com.classdemo.initVariable;

/**
 * Created by jibingbing on 2017/12/7.
 */
public class Creature {
    {
        System.out.println("Creature的非静态初始化块");
    }

    public Creature() {
        System.out.println("Creature 无参构造器");
    }

    public Creature(String name){
        System.out.println("Creature 带有name的参数构造器,name参数:" + name);
    }
}
