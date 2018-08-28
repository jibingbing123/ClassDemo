package com.classdemo.initVariable;

/**
 * 初始化第一阶段:系统先为INSTANCE,initPrice两个类变量分配内存空间,此时两个类变量的默认初始值为NULL和0;
 * 初始化第二个阶段:程序按顺序依次为INSTANCE,initPrice赋值,在给INSTANCE赋值时,需要调用Price类的构造器,
 * 此时initPrice还没有被赋值,值为0,所以currentPrice的值为0-2.8=-2.8;
 * 当INSTANCE被赋值完后,系统再将initPrice的值初始化为20,再次创建Price实例时,currentPrice的值就为20-2.8=17.2了
 * Created by jibingbing on 2017/12/7.
 */
public class Price {
    final static Price INSTANCE = new Price(2.8);
    static double initPrice = 20;
    double currentPrice;

    public Price(double discount) {
        currentPrice = initPrice - discount;
    }
}
