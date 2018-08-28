package com.classdemo.initVariable;

/**
 * 当创建任何Java对象时,程序总会先依次调用每个父类的非静态初始化块,父类构造器执行初始化,
 * 最后才调用本类的非静态初始化块,构造器执行初始化
 * Created by jibingbing on 2017/12/5.
 */
public class InitTest {
    public static void main(String[] args) {
        Cat cat = new Cat("Ketty",2);
        System.out.println(cat);

        Cat cat2 = new Cat("jenny",3);
        System.out.println(cat2);

        System.out.println("*******************显式和隐式调用弗雷构造器********************");
        new Wolf(5.6);
    }
}
