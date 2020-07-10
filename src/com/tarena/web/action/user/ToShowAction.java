package com.tarena.web.action.user;

import com.tarena.dao.DAOFactory;
import com.tarena.dao.UserDAO;
import com.tarena.entity.User;
import com.tarena.web.action.BaseAction;

public class ToShowAction extends BaseAction{
	private User user;
	public String execute() throws Exception {
		System.out.println("ToShowAction");
		
		if(session.get("s_user") == null) {
			return "error"; 
		}
		UserDAO dao = DAOFactory.getUserDAO();
		user = (User) session.get("s_user");
		
		return "success";
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
