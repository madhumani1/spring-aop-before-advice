/**
 * 
 */
package com.madhu.aopdemo.dao;

import org.springframework.stereotype.Component;

/**
 * @author 15197
 * Create target object: MembershipDAO
 */
@Component
public class MembershipDAO {
	public void addAccount() {
		System.out.println(getClass() + ": DOING STUFF: ADDING A MEMBERSHIP ACCOUNT");
	}
}
