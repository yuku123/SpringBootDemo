package com.wisely.highlight_spring4.summary.dependency;

import org.springframework.stereotype.Service;

@Service
public class ServiceInjectionInside {
    public void say(){
        System.out.println("ServiceInjectionInside.say()");
    }
}
