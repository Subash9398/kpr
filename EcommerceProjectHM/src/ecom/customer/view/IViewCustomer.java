package ecom.customer.view;

import java.sql.SQLException;

import ecom.customer.presenter.IPresenterCustomer;

public interface IViewCustomer {
	void setPresenter(IPresenterCustomer presenetr) throws SQLException;
	void buy(int product_Id) throws SQLException;
	public void addToCart(int product_id) throws SQLException;
	public void cartdetails() throws SQLException;
}
