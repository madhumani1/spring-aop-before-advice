/**
 * 
 */
package com.madhu.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.madhu.aopdemo.Account;

/**
 * @author 15197
 * Create target object: AccountDAO
 */
@Component
public class AccountDAO {
	private String name;
	private String serviceCode;
	
	public void addAccount() {
		System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
	}
	
	public void addAccount(Account theAccount, boolean vipFlag) {
		System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
	}
	
	public void addMember() {
		System.out.println(getClass() + ": DOING MY DB WORK: ADD A MEMBER FROM ACCOUNTDAO");
	}

	/**
	 * @return the name
	 */
	public String getName() {
		System.out.println("inside accountDAP.getName()");
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		System.out.println("inside accountDAP.setName(name)");
		this.name = name;
	}

	/**
	 * @return the serviceCode
	 */
	public String getServiceCode() {
		System.out.println("inside accountDAP.getServiceCode()");
		return serviceCode;
	}

	/**
	 * @param serviceCode the serviceCode to set
	 */
	public void setServiceCode(String serviceCode) {
		System.out.println("inside accountDAP.setServiceCode(serviceCode)");
		this.serviceCode = serviceCode;
	}
	
}
