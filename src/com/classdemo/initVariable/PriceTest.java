package com.classdemo.initVariable;

/**
 * Created by jibingbing on 2017/12/7.
 */
public class PriceTest {
    public static void main(String[] args) {
        System.out.println(Price.INSTANCE.currentPrice);
        Price price = new Price(2.8);
        System.out.println(price.currentPrice);
    }
}
