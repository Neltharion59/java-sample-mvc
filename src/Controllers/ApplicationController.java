package Controllers;

import Services.Services;

public abstract class ApplicationController {
	
	public Services Services;
	
	public ApplicationController()
	{
		Services = new Services();
	}
	
	public void OnActionExecuting()
	{
		
	}
}
