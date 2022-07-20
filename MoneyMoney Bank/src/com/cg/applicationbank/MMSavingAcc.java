package com.cg.applicationbank;

import com.cg.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc 
{
	private static final float MINBAL=2000;

	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) 
	{
		super(accNo, accNm, accBal, isSalaried);

	}

	public void withdraw(float accBal)
	{
		System.out.println("Withdrawl amount:"+accBal);
	}
	@Override
	public String toString()
	{
		return "MMSavingAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
}


