package ecom.list.view;

import java.sql.SQLException;

import ecom.list.presenter.IPresenterList;
public interface IViewList
{
public void category() throws SQLException;
public void setPresenter(IPresenterList prese) throws SQLException;
public void updateStatusLabel(String result) ;

}
