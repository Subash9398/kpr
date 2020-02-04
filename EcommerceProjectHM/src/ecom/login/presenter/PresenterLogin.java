package ecom.login.presenter;

import ecom.login.model.IModelLogin;
import ecom.login.view.IViewLogin;

public class PresenterLogin implements IPresenterLogin {
	private IModelLogin modellogin;
	private IViewLogin viewlogin;

public PresenterLogin(IViewLogin view, IModelLogin model) {
	// TODO Auto-generated constructor stub
	this.modellogin=model;
	this.viewlogin=view;
}


public void pass(String pass,String user)
{
	modellogin.set(pass,user);
}
public void login() 
{
   try {
	System.out.println(modellogin.login());
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}
