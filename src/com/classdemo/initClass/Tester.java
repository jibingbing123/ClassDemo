package com.classdemo.initClass;

/**
 * 1.对于final类型的静态变量,如果在编译时就能计算出变量的值,那么这种话变量被看作成编译时常量.
 * Java对编译时常量的使用,被看做是对类的被动使用,不会导致类的初始化
 * 2.对于final类型的静态变量,如果在编译时不能计算出变量的取值,那么程序对类的这种变量的取值,被看作是对类的主动使用,
 * 会导致类的初始化.
 * Created by jibingbing on 2017/12/12.
 */
public class Tester {
//    public static final int a = 23;
    public static final int a = (int)(Math.random()*5);

    static {
        System.out.println("init Test");
    }
}
