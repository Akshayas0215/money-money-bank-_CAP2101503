package com.cg.applicationbank;
import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class MMBankFactory extends BankFactory 
{

	@Override
	public SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalaried) 
	{
		MMSavingAcc sa=new MMSavingAcc(accNo,accNm,accBal,isSalaried);
		return sa;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit)
	{
		MMCurrentAcc ca=new MMCurrentAcc(accNo,accNm,accBal,creditLimit);
		return ca;
	}
}
