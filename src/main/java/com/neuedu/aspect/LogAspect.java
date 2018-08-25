package com.neuedu.aspect;


import com.neuedu.entity.CartInfo;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;

/**
 * 日志服务切面
 * */
public class LogAspect {
     public  void start(int a,String name){
          System.out.print("方法开始执行");
          System.out.println("\t"+a+"\t"+name);
     }
     public  void throwing(int a,String name,Throwable as){
          System.out.println("方法抛出异常");
          System.out.println("\t"+a+"\t"+name);
     }


     public void after_return(int a, String name, CartInfo asdas){
          System.out.println("____after_return____"+asdas);
          System.out.println("\t"+a+"\t"+name);
     }


     public  void finish(int a,String name){
          System.out.println("方法执行完成");
          System.out.println("\t"+a+"\t"+name);
     }

     public void ads(ProceedingJoinPoint ppp){
          try {
               ppp.getTarget();
               ppp.getArgs();
               ppp.getSignature().getName();
               ppp.proceed();
          } catch (Throwable throwable) {
               throwable.printStackTrace();
          }

     }
}
