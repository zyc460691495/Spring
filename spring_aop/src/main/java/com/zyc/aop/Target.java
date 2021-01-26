package com.zyc.aop;

import com.zyc.aop.TargetInterface;

public class Target implements TargetInterface {
    public void save() {
//        int a=5/0;
        System.out.println("save...........");
    }
}
