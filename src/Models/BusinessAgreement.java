package Models;

import java.util.Random;

public class BusinessAgreement {
	public int AgreementNumber;
	public String ExpirationDate;
	
	public BusinessAgreement(int agreementNumber)
	{
		AgreementNumber = agreementNumber;
	}
	
	public void Load()
	{
		Random generator = new Random();
		ExpirationDate = String.format("{0}.{1}.1997", generator.nextInt(1, 29), generator.nextInt(1, 13));
	}
}
