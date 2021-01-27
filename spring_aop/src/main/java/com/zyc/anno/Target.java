package com.zyc.anno;

import com.zyc.anno.TargetInterface;
import org.springframework.stereotype.Component;


@Component("target")
public class Target implements TargetInterface {
    public void save() {
//        int a=5/0;
        System.out.println("save...........");
    }
}
