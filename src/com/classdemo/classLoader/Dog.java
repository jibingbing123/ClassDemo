package com.classdemo.classLoader;

/**
 * Created by jibingbing on 2017/12/14.
 */
public class Dog {
    public Dog() {
        System.out.println("Dog id loaded by " + this.getClass().getClassLoader());
    }
}
