package com.classdemo.initVariable;

/**
 * 实例变量的初始化时机
 * Java对象的三种初始化方式:构造器,初始化块,定义变量时指定的初始值
 * 非静态初始化块一定在构造器之前被调用
 * Created by jibingbing on 2017/12/5.
 */
public class Cat {
    String name;
    int age;

    public Cat(String name, int age) {
        System.out.println("执行构造器");
        this.name = name;
        this.age = age;
    }

    {
        System.out.println("执行非静态初始化块");
        weight = 2.0;
    }

    double weight = 2.3;

    public String toString(){
        return "Cat[name = " + name + ",age = " + age + ",weigth = " + weight + "]";
    }
}
