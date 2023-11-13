package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;

public class DaoFactory {
	
	public static DepartmentDAO creteDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());		
	}
	
}

