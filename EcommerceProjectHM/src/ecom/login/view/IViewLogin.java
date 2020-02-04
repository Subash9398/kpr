package ecom.login.view;

import ecom.login.presenter.IPresenterLogin;

public interface IViewLogin {
	void userlogin();
	void setPresenter(IPresenterLogin presenter);
	void updateStatusLabel(String result);
}
