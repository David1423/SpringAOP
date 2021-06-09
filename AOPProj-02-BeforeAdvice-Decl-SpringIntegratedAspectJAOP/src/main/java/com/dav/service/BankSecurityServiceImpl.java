package com.dav.service;

public class BankSecurityServiceImpl implements IBankSecurity {

	@Override
	public void withdraw(int accno, int amt) {
		System.out.println(amt+" has been withdrawn from account"+ accno);
	}

	@Override
	public void deposit(int accno, int amt) {
		System.out.println(amt+" has been deposited to account"+ accno);

	}

}
