package com.cg.applicationbank;

import com.cg.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc 
{
	
	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) 
	{
		super(accNo, accNm, accBal, creditLimit);
	
	}

	public void withdraw(float creditLimit)
	{
		System.out.println("Check the current account balance:" +getAccBal());
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
}
	
	



