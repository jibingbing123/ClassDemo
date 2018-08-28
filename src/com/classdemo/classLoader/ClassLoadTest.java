package com.classdemo.classLoader;

/**
 * 类加载的过程采用父类委托机制:
 * 除了根加载器之外,其他加载器有且只有一个父类加载器
 * 当Java程序请求加载器加载一个类时,加载器会首先委托自己的父类加载器去加载这个类,如果父类能加载,则由父类加载,否则才
 * Created by jibingbing on 2017/12/13.
 */
public class ClassLoadTest {
    public static void main(String[] args) {
        Class c;
        ClassLoader cl,cl1;

        //获取系统加载器
        cl = ClassLoader.getSystemClassLoader();
        System.out.println("系统加载器为: " + cl);

        //打印出系加载器的父加载器和父加载器的父加载器
        //打印结果说明系统加载器的父加载器是扩展类加载器,扩展类加载器的父加载器是根加载器
        while(cl != null){
            cl1 = cl;
            cl = cl1.getParent();
            System.out.println(cl1 + "的父加载器为" + cl);
        }

        try {
            //Object的父类加载器是根加载器
            c = Class.forName("java.lang.Object");
            cl = c.getClassLoader();
            System.out.println("Object的加载器为: " + cl);

            //当前类是由系统加载器加载的
            c = Class.forName("com.classdemo.classLoader.ClassLoadTest");
            cl = c.getClassLoader();
            System.out.println("测试类的加载器为: " + cl);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
