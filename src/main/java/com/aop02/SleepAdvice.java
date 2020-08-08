package com.aop02;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class SleepAdvice implements MethodBeforeAdvice, AfterReturningAdvice {


    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {

        System.out.println("睡前002");
        System.out.println("睡前0021");


      
    }

    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {

        System.out.println("睡后002");

    }


}
