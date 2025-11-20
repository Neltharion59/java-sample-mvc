package Controllers;

import Models.UserAccountInfo;

public class AccountController extends ApplicationController {

	private UserAccountInfo UserInfo;
	
	public AccountController()
	{
		super();
	}
	
	public void Login(String name, String password)
	{
		boolean loginSuccess = Services.UserService.CheckLogin(name, password);
		
		if (loginSuccess)
		{
			UserInfo = Services.UserService.FetchUserInfo(name);
		}
	}
	
	public static void main(String[] args)
	{
		AccountController controller = new AccountController();
		controller.Login("jozo", "password123");
	}
}
