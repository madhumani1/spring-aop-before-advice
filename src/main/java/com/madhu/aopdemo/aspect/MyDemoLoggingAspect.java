/**
 * 
 */
package com.madhu.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author 15197
 * Create an Aspect with @Before advice
 */

@Aspect
@Component
@Order(1)
public class MyDemoLoggingAspect {
	// this is where we will add all of our related advices for logging
	
	/*
	 * // This will go in MadAOPExpressions
	 * @Pointcut("execution(* com.madhu.aopdemo.dao.*.*(..))") private void
	 * forDaoPackage() {}
	 * 
	 * // create pointcut for getter methods
	 * 
	 * @Pointcut("execution(* com.madhu.aopdemo.dao.*.get*(..))") private void
	 * getter() {}
	 * 
	 * // create pointcut for setter methods
	 * 
	 * @Pointcut("execution(* com.madhu.aopdemo.dao.*.set*(..))") private void
	 * setter() {}
	 * 
	 * // create pointcut: include package ... exclude getter/setter
	 * 
	 * @Pointcut("forDaoPackage() && !(getter()||setter())")
	 * //@Pointcut("forDaoPackage()") private void forDaoPackageNoGetterSetter() {}
	 */
	
	//start with @Before advice with pointcut expression
	@Before("com.madhu.aopdemo.aspect.MadAOPExpressions.forDaoPackageNoGetterSetter()")
	public void beforeAddAccountAdvice()	{
		System.out.println("=====>>> Executing @Before advice on addAccount()\n");
	}
	
	/*
	 * @Before("forDaoPackageNoGetterSetter()") public void performApiAnalytics() {
	 * System.out.println("=====>>> Performing API analytics\n"); }
	 * 
	 * @Before("forDaoPackageNoGetterSetter()") public void logToCloudAsync() {
	 * System.out.println("=====>>> Logging to Cloud in async fashion\n"); }
	 */
}
