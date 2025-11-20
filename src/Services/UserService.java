package Services;

import Models.UserAccountInfo;

public class UserService {

	public boolean CheckLogin(String name, String password)
	{
		LogLoginAttempt(name, password);
		
		if (name == "jozo" && password == "password123")
		{
			LogLoginSuccess(name);
			return true;
		}
		
		LogLoginFailure(name);
		return false;
	}
	
	public UserAccountInfo FetchUserInfo(String name)
	{
		UserAccountInfo userInfo = null;
		
		if (name == "jozo")
		{
			userInfo = new UserAccountInfo();
			userInfo.name = name;
			userInfo.birthDate = "22.4.1976";
			userInfo.agreementNumbers = new int[] {};
		}

		if (userInfo != null && userInfo.agreementNumbers.length > 0)
		{
			userInfo.LoadBussinessAgreements();
		}
		
		return userInfo;
	}
	
	public void LogLoginAttempt(String name, String password)
	{
		String logMessage = String.format("Attempting to login with credentials '%s' and '%s'.", name, password);
		LogService.Log(logMessage);
	}
	
	public void LogLoginSuccess(String name)
	{
		String logMessage = String.format("User '%s' successfully logged in.", name);
		LogService.Log(logMessage);
	}
	
	public void LogLoginFailure(String name)
	{
		String logMessage = String.format("User '%s' failed to log in.", name);
		LogService.Log(logMessage);
	}
}
