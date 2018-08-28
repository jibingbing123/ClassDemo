package com.classdemo.classLoader;

/**
 * Created by jibingbing on 2017/12/14.
 */
public class Sample {
    public int v1 = 1;

    public Sample() {
        System.out.println("Sample is loaded by " +  this.getClass().getClassLoader());
        new Dog();
    }
}
