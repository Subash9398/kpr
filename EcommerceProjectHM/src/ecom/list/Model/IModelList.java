package ecom.list.Model;

import java.sql.SQLException;

public interface IModelList 
{
Object category() throws SQLException ;
Object productlist(String i) throws SQLException;	
}
