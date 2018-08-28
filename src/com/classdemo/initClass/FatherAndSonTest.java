package com.classdemo.initClass;

/**
 * 只有当程序访问的是当前类的静态变量或者静态方法在当前类或者接口内定义时,才可以看作是对类或接口的主动使用;
 * 下面的例子就是当子类访问父类的静态变量和方法时,并不会初始化子类
 * Created by jibingbing on 2017/12/12.
 */
public class FatherAndSonTest {
    public static void main(String[] args) {
        System.out.println("a = " + Son.a);
        Son.method();
    }
}
