package com.wisely.highlight_spring4.summary.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceInjection {
    @Autowired
    ServiceInjectionInside serviceInjectionInside;

    public void say1(){
        System.out.println("ServiceInjection.say()");
    }

    public void say2(){
        serviceInjectionInside.say();
    }

}
