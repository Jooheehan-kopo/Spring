package aop.test;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class MyAspect {

	/*
	 * public void teen() { System.out.println("미성년자입니다."); }
	 */
	@AfterReturning("execution(* aop.test.*.setAge(..))")
	public void adult(JoinPoint joinpoint) {
//		System.out.println(joinpoint.getTarget());
//		System.out.println(joinpoint.getSignature());
//		System.out.println(Arrays.toString(joinpoint.getArgs()));
	
		Object[] args = joinpoint.getArgs();
		if((Integer)args[0] < 20) {
			System.out.println("미성년입니다");
		}else {
			System.out.println("성인입니다.");
		}
	}
	
	@Around("execution(* aop.test.*.setAge(..))")
	public void adult2(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println(Arrays.toString(joinPoint.getArgs()));
		joinPoint.proceed();
//		System.out.println("성인2"); //순서 쓰는순서대로 before,after
	}
	@AfterThrowing(pointcut="execution(* aop.test.*.setAge(..))", throwing="ex")
	public void error(JoinPoint joinPoint, Throwable ex) {
		System.out.println("예외처리"+ex.toString());
		
	}
}
