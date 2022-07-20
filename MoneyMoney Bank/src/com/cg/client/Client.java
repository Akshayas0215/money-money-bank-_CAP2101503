package com.cg.client;

import com.cg.applicationbank.MMBankFactory;
import com.cg.applicationbank.MMCurrentAcc;
import com.cg.applicationbank.MMSavingAcc;
import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class Client {

	public static void main(String[] args) {

		BankFactory bf=new MMBankFactory();
		SavingAcc sa=new MMSavingAcc(39736,"SAVING",40000,true);
		CurrentAcc ca=new MMCurrentAcc(39736,"Saving",50000,5000);
		sa.withdraw(sa.getAccBal());
		ca.withdraw(ca.getCreditLimit());

	}

}
