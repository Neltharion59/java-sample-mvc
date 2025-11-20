package Models;

public class UserAccountInfo {

	public String name;
	public String birthDate;
	public int[] agreementNumbers;
	public BusinessAgreement[] Agreements;
	
	public void LoadBussinessAgreements()
	{
		Agreements = new BusinessAgreement[agreementNumbers.length];
		
		for(int i = 0; i < agreementNumbers.length; i++)
		{
			Agreements[i] = new BusinessAgreement(this.agreementNumbers[i]);
			Agreements[i].Load();
		}
	}
}
