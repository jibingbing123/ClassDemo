package com.classdemo.initVariable;

/**
 * 类变量的初始化顺序
 * Created by jibingbing on 2017/12/7.
 */
public class StaticInitTest {
    static int count = 2;

    static {
        System.out.println("StaticInitTest的静态初始化块");
        name = "Java编程";
    }

    static String name = "疯狂Java讲义";

    public static void main(String[] args) {
        System.out.println("count类变量的值:" + StaticInitTest.count);
        System.out.println("name类变量的值:" + StaticInitTest.name);
    }
}
