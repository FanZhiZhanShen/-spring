package com.neuedu.aspect;


import com.neuedu.entity.CartInfo;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.stereotype.Component;

/**
 * 日志服务切面
 * */
@Component
@Aspect
public class LogAspect2 {

     @Pointcut("execution(* com.neuedu.service.ProductService.addProduct(int,String))")
     public void test(){}
//
//     @Before("test(as,namesd)")
//     public  void start(int as,String namesd){
//          System.out.print("方法开始执行");
//          System.out.println("==="+"\t"+as+"\t"+namesd);
//     }
//
//     @AfterThrowing(value = "test(as1,namesd)",throwing = "as")
//     public  void throwing(int as1,String namesd,Throwable as){
//          System.out.println("方法抛出异常");
//          System.out.println("\t"+as+"\t"+namesd+"\t"+as);
//     }
//
//     @AfterReturning(value = "test(a,name)",returning = "asdd")
//     public void after_return(int a, String name,CartInfo asdd){
//          System.out.print("____after_return____");
//          System.out.println("==="+"\t"+a+"\t"+name+"\t"+asdd);
//     }
//
//     public  void finish(int a,String name){
//          System.out.println("方法执行完成");
//          System.out.println("\t"+a+"\t"+name);
//     }
     @Around("test()")
     public void ads(ProceedingJoinPoint ppp){
          try {

                System.out.println(ppp.getTarget());
               System.out.println(ppp.getArgs());
               System.out.println(ppp.getSignature().getName());
               System.out.println(ppp.proceed());
          } catch (Throwable throwable) {
               throwable.printStackTrace();
          }

     }
}
