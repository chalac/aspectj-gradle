package com.chitturi.chala.aspectjgradle.moduleaspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

    @Pointcut("execution(* com.chitturi.chala.aspectjgradle.modulebase.BaseClass.gradelBaseMethod(String)) && args(argument)")
    public void baseMethodPointcut(String argument) {
    }

    @Around("baseMethodPointcut(argument)")
    public Object logMethodExecution(ProceedingJoinPoint joinPoint, String argument) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        System.out.printf("START: %s.%s%n", methodName, argument);
        try {
            Object result = joinPoint.proceed();
            System.out.printf("END: %s with result: %s%n", methodName, result);
            return result;
        } catch (Exception e) {
            System.out.printf("EXCEPTION: %s failed with: %s%n", methodName, e.getMessage());
            throw e;
        }
    }
}
