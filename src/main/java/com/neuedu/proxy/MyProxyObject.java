package com.neuedu.proxy;

import com.neuedu.aspect.LogAspect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/***
 *
 * jdk的动态代理
 * **/
public class MyProxyObject implements InvocationHandler {
    private LogAspect logAspect=new LogAspect();

    public Object taeget;//原对象

    public MyProxyObject(Object taeget) {
        this.taeget = taeget;
    }
    public MyProxyObject() {

    }

    /**
     * newInstance（）：该方法生成代理对象
     *
     * Object：原对象
     * 代理对象由Proxy.newProxyInstance(object.getClass().getClassLoader(),
     object.getClass().getInterfaces(),
     new MyProxyObject(object));生成
          -前提：原对象的类一定要实现接口

     * */
    public static Object newInstance(Object object){
        Object o= Proxy.newProxyInstance(object.getClass().getClassLoader(),
                object.getClass().getInterfaces(),
                new MyProxyObject(object));
        return o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        logAspect.start();

        method.invoke(taeget,args);//该方法是通过java反射机制 调用原对象taeget的方法
        return null;
    }
}
