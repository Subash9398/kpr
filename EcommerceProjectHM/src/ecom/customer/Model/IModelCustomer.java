package ecom.customer.Model;

import java.sql.SQLException;

public interface IModelCustomer {
	public String buy(int product_Id,int quantity,int price) throws SQLException;
	public String addcart(int product_id,String customer) throws SQLException;
	public Object showcart(String Customer_Name) throws SQLException;
	public String removecart(int S_No) throws SQLException;
}
