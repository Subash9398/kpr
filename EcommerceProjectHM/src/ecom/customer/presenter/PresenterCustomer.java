package ecom.customer.presenter;

import java.sql.SQLException;

import ecom.customer.Model.IModelCustomer;

import ecom.customer.view.IViewCustomer;

public class PresenterCustomer implements IPresenterCustomer {
	IModelCustomer modelcustomer;
	IViewCustomer viewcustomer;
	public PresenterCustomer(IViewCustomer view, IModelCustomer model) {
		// TODO Auto-generated constructor stub
		this.modelcustomer=model;
		this.viewcustomer=view;
	}

 public String buy(int product_Id,int quantity,int price) throws SQLException
{
	 return modelcustomer.buy(product_Id,quantity,price);
}
 public String addcart(int product_id,String customer) throws SQLException
 {
	 return modelcustomer.addcart(product_id,customer);
 }
 public Object showcart(String customer) throws SQLException
 {
	 
	 return modelcustomer.showcart(customer);
 }
 public String removecart(int S_No) throws SQLException
 {
	 return modelcustomer.removecart(S_No);
 }
}
