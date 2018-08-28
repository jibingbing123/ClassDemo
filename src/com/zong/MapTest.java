package com.zong;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @description:
 * @author: jibingbing
 * @create: 2018/04/09
 **/
public class MapTest {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        new Thread(new Runnable() {
            @Override
            public void run() {
                map.remove(1);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()){
                    System.out.println(it.next());
                }
            }
        }).start();



        System.out.println("success");
    }
}
