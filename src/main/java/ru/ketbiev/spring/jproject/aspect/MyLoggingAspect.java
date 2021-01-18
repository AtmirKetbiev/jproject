package ru.ketbiev.spring.jproject.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyLoggingAspect {
    @Around("execution(* ru.ketbiev.spring.jproject.dao.*.*(..))")
    public Object aroundAllRepositoryMethodsAround(
            ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        String className = proceedingJoinPoint.getSignature().getDeclaringTypeName();
        String methodName = proceedingJoinPoint.getSignature().getName();

        System.out.println("Begin of " + methodName + " in " + className);

        Object targetMethodResult = proceedingJoinPoint.proceed();

        System.out.println("End of " + methodName + " in " + className);

        return targetMethodResult;
    }
}
