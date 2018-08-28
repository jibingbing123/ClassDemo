package com.classdemo.initClass;

/**
 * Created by jibingbing on 2017/12/12.
 */
public class Father {
    static int a = 1;

    static {
        System.out.println("init Father");
    }

    static void method(){
        System.out.println("method of Father");
    }
}
