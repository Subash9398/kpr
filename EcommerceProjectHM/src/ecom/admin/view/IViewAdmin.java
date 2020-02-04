package ecom.admin.view;

import java.sql.SQLException;

import ecom.admin.presenter.IPresenterAdmin;

public interface IViewAdmin {
	public void setPresenter(IPresenterAdmin prese) throws SQLException;
	void addproducts() throws SQLException;
	void removeproducts() throws SQLException;
	void viewproducts() throws SQLException;
}
