/**
 * 
 */
package com.madhu.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author 15197
 * Create an Aspect with @Before advice
 */

@Aspect
@Component
public class MyDemoLoggingAspect {
	// this is where we will add all of our related advices for logging
	
	@Pointcut("execution(* com.madhu.aopdemo.dao.*.*(..))")
	private void forDaoPackage() {}
	
	// create pointcut for getter methods
	@Pointcut("execution(* com.madhu.aopdemo.dao.*.get*(..))")
	private void getter() {}
	
	// create pointcut for setter methods
	@Pointcut("execution(* com.madhu.aopdemo.dao.*.set*(..))")
	private void setter() {}
	
	// create pointcut: include package ... exclude getter/setter
	@Pointcut("forDaoPackage() && !(getter()||setter())")
	//@Pointcut("forDaoPackage()")
	private void forDaoPackageNoGetterSetter() {}
	
	//start with @Before advice with pointcut expression
	@Before("forDaoPackageNoGetterSetter()")
	public void beforeAddAccountAdvice()	{
		System.out.println("=====>>> Executing @Before advice on addAccount()\n");
	}
	
	@Before("forDaoPackageNoGetterSetter()")
	public void performApiAnalytics() {
		System.out.println("=====>>> Performing API analytics\n");		
	}
}
