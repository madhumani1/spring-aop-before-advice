/**
 * 
 */
package com.madhu.aopdemo.dao;

import org.springframework.stereotype.Component;

/**
 * @author 15197
 * Create target object: AccountDAO
 */
@Component
public class AccountDAO {
	public void addAccount() {
		System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
	}
}
