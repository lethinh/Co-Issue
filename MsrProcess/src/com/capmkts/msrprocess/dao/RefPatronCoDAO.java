package com.capmkts.msrprocess.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.capmkts.msrprocess.data.RefProgram;
import com.capmkts.msrprocess.util.HibernateUtil;

public class RefPatronCoDAO {
	
	public void save(RefProgram refFile) {

		HibernateUtil.save(refFile);
	}
	
	public String getPatronCompanyByLenderNum(int lenderNum){
		
		String patronName = "";
		
		Session session = HibernateUtil.getSession();
		
		try{
			Query query = session.createQuery("select patronCoName from PatronCompany where lenderNum = '" +lenderNum+ "'");
			
			List list = query.list();
			patronName = list.get(0).toString();
			
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
		}
	
		return patronName;
	}
}