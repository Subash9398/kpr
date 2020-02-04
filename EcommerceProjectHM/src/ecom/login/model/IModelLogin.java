package ecom.login.model;

public interface IModelLogin {
	
	void set(String pass,String user) ;
	String getuser();
	String getPassword();
	String login() throws Exception;

}
