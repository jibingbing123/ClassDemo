package com.classdemo.initClass;

/**
 * ClassLoader类的loadClass()方法加载一个类,并不是对类的主动使用,不会导致类的初始化;
 * 当程序调用Class类的静态方法forName()时,会显式的初始化ClassA,是对类的主动使用
 * Created by jibingbing on 2017/12/12.
 */
public class CLassB {
    public static void main(String[] args) throws Exception {
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        Class objClass = loader.loadClass("com.classdemo.initClass.ClassA");
        System.out.println("After load ClassA");
        System.out.println("Before init ClassA");
        objClass = Class.forName("com.classdemo.initClass.ClassA");
    }
}
