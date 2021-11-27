/**
 * 
 */
package com.madhu.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
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
	
	//start with @Before advice with pointcut expression
	@Before("com.madhu.aopdemo.aspect.MadAOPExpressions.forDaoPackageNoGetterSetter()")
	public void beforeAddAccountAdvice(JoinPoint theJoinPoint)	{
		// display the method signature
		MethodSignature methodSig = (MethodSignature) theJoinPoint.getSignature();
		// medhodSig will be com.madhu.aopdemo.dao.AccountDAO.addAccount(Account, boolean)
		System.out.println("Method: "+methodSig);
		System.out.println("=====>>> Executing @Before advice on addAccount()\n");
		
		// get arguements
		Object[] args = theJoinPoint.getArgs();
		
		// loop through args
		for(Object tempArgs : args)	{
			System.out.println("Method argument: " + tempArgs);
		}
	}
}
