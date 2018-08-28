package com.classdemo.classVariable;

/**
 * static修饰的成员变量是类变量,属于类本身;
 * 没有被static修饰的成员变量是实例变量,属于该类的实例;每次程序创建java对象都需要为实例变量分配内存,并执行初始化
 * 在同一个JVM内,每个类对应一个Class对象,每个类可以创建多个java对象.
 * Created by jibingbing on 2017/12/5.
 */
public class FieldTest {
    public static void main(String[] args) {
        Person.eyeNum = 2;
        System.out.println("Person的eyeNum属性:" + Person.eyeNum);

        Person person = new Person();
        person.name = "季兵兵";
        person.age = 22;
        System.out.println("通过实例person来访问eyeNum类变量:" + person.eyeNum);
        person.info();

        Person person2 = new Person();
        person2.name = "刘影";
        person2.age = 21;
        person2.info();
        person2.eyeNum = 4;

//        不管以哪种方式访问eyeNum,底层都是转换成通过Person类访问类属性
        System.out.println("通过Person类访问eyeNum类属性:" + Person.eyeNum);
        System.out.println("通过实例person访问eyeNum类属性:" + person.eyeNum);
        System.out.println("通过实例person2访问eyeNum类属性:" + person2.eyeNum);
    }
}
