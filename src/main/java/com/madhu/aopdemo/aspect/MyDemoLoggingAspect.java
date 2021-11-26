/**
 * 
 */
package com.madhu.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author 15197
 * Create an Aspect with @Before advice
 */

@Aspect
@Component
public class MyDemoLoggingAspect {
	// this is where we will add all of our related advices for logging
	
	//start with @Before advice with pointcut expression
	@Before("execution(* add*(com.madhu.aopdemo.Account,..))")
	public void beforeAddAccountAdvice()	{
		System.out.println("\n=====>>> Executing @Before advice on addAccount()");
	}
}
