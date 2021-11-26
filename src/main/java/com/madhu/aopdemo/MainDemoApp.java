/**
 * 
 */
package com.madhu.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.madhu.aopdemo.dao.AccountDAO;
import com.madhu.aopdemo.dao.MembershipDAO;

/**
 * @author 15197
 * Create main app
 */
public class MainDemoApp {
	public static void main(String[] args)	{
		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// get the bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		// get membership bean from spring container
		MembershipDAO theMembershipDAO = 
				context.getBean("membershipDAO", MembershipDAO.class);
		
		// call business method
		theAccountDAO.addAccount();
		theAccountDAO.addMember();
		
		//call business method again
		//System.out.println("\nlet's call the method again");
		//theAccountDAO.addAccount();
		
		// call the membership business method
		theMembershipDAO.addAccount();
		
		//close context
		context.close();
	}
}
