package ecom.admin.presenter;

import java.sql.SQLException;

import ecom.admin.model.IModelAdmin;
import ecom.admin.view.IViewAdmin;

public class PresenterAdmin implements IPresenterAdmin {
	private IModelAdmin modeladmin;
	private IViewAdmin viewadmin;
	public PresenterAdmin(IViewAdmin view, IModelAdmin model) {
		// TODO Auto-generated constructor stub
		this.modeladmin=model;
		this.viewadmin=view;
	}
	public String addproducts(Object details) throws SQLException
	{
		return modeladmin.adddetails(details);
	}
	public String removeProducts(int S_No) throws SQLException
	{
		return modeladmin.removefromtable(S_No);
	}
	
}
