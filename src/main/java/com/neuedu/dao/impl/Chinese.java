package com.neuedu.dao.impl;

import com.neuedu.dao.Person;

public class Chinese implements Person {
    @Override
    public String sayHello(String name) {
        System.out.println("--sayHello()--");
        return name+"hello,aop";
    }
    public void eat(String food){
        System.out.println("我正在吃："+food);
    }
}
