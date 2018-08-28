package com.classdemo.initClass;

/**
 * 当编译器生成.class文件时,它不会在main方法的字节码流中保存一个表示Tester.a的符号引用,
 * 而是直接在字节码流中嵌入常量值23,因此当程序访问Tester.a时,客观上无需初始化Tester类
 * Created by jibingbing on 2017/12/12.
 */
public class Sample {
    public static void main(String[] args) {
        System.out.println("a = " + Tester.a);
    }
}
