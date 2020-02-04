package ecom.login.model;

import java.sql.Statement;
import java.util.Scanner;

import ecom.admin.model.ModelAdmin;
import ecom.admin.presenter.PresenterAdmin;
import ecom.admin.view.IViewAdmin;
import ecom.admin.view.ViewAdmin;
import ecom.customer.Model.ModelCustomer;
import ecom.customer.presenter.PresenterCustomer;
import ecom.customer.view.IViewCustomer;
import ecom.customer.view.ViewCustomer;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;



public class ModelLogin implements IModelLogin {
	private String password;
	  private String username;
	  
	  private String passwordfromdb;
	  private String usernamefromdb;
	  
		public void set(String pass,String user) 
	    {
	        this.password = pass;
	        this.username=user;
	    } 
	    public String getuser() {
			// TODO Auto-generated method stub
			return username;}
		public String getPassword() {
			// TODO Auto-generated method stub
			return password;
		}
			
		public String login() throws SQLException  {
			Connection c=DriverManager.getConnection("jdbc:sqlserver://106.51.1.63; database = {fresher_ecom_task}","ecomfresher","Change@Fresher");
			Statement s1= c.createStatement();
			 		
		ResultSet rs = s1.executeQuery("select*from login");
		
		 String result = "Enter valid credinals";

		while(rs.next())
		{
		
		this.usernamefromdb  = rs.getString("User_Name");
		
		this.passwordfromdb = rs.getString("Password");
		
	    if(this.usernamefromdb.equalsIgnoreCase(this.username)&&this.passwordfromdb.equals(this.password)) {
	    if(username.contains("@admin"))
	    {
	    	IViewAdmin viewadmin=new ViewAdmin();
			viewadmin.setPresenter(new PresenterAdmin(viewadmin,new ModelAdmin()));
			
	    }else
	    {
			IViewCustomer view=new ViewCustomer(this.usernamefromdb);
			view.setPresenter(new PresenterCustomer(view,new ModelCustomer()));
	    }
	    Scanner scanner = new Scanner(System.in);
	    	break;
	    }
	  	     }
		
		return result;
		}
}
