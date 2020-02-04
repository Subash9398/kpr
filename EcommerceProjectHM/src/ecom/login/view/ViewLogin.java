package ecom.login.view;

import java.util.Scanner;

import ecom.login.model.ModelLogin;
import ecom.login.presenter.IPresenterLogin;
import ecom.login.presenter.PresenterLogin;

public class ViewLogin implements IViewLogin {
	
	private IPresenterLogin presenterlogin; 
	
	public void userlogin() {
	Scanner scannerObject = new Scanner(System.in);
	System.out.println("Enter the Username");
	String username = scannerObject.next();
	System.out.println("Enter the password");
	String password = scannerObject.next();
	presenterlogin.pass(password,username);
	presenterlogin.login();
	}

	public void setPresenter(IPresenterLogin presenter) {
		// TODO Auto-generated method stub
		this.presenterlogin = presenter;
		userlogin();

	}

	public void updateStatusLabel(String result) {
		// TODO Auto-generated method stub
		System.out.println(result);
	}

	public static void main(String args[]) {
		
		ViewLogin view=new ViewLogin();
		view.setPresenter(new PresenterLogin(view,new ModelLogin()));	
	}
}
