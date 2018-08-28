package com.classdemo.initVariable;

/**
 * Created by jibingbing on 2017/12/7.
 */
public class Animal extends Creature {
    {
        System.out.println("Animal 的非静态初始化块");
    }

    public Animal() {
        System.out.println("Animal 的无参构造器");
    }

    public Animal(String name) {
        super(name);
        System.out.println("Animal 带有name的参数的构造器,参数name:" + name);
    }

    public Animal(String name,int age){
        this(name);
        System.out.println("Animal 带2个参数的构造器,其age: " + age);
    }
}
