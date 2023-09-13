package by.tms.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExecutionTimeAspect {

    @Pointcut("execution(public void by.tms.service.RaceServiceImpl.startRace())")
    public void pointcut(){
    }

    @Around("pointcut()")
    public Object measure(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long current = System.currentTimeMillis();
        Object proceed = proceedingJoinPoint.proceed();
        long afterRace = System.currentTimeMillis();
        System.out.println("Method was finished in " + (afterRace - current) + " ms");
        return proceed;
    }
}
