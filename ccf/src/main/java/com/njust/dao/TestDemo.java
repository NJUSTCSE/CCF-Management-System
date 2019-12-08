package com.njust.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.SessionFactory.HibernateSessionFactory;
import com.njust.entity.Submit;

public class TestDemo {
	@Test
	public void findAll() {
		
	//	boolean flag = false;
	//	SessionFactory sessionFactory = null;
		Session session = null;
		Transaction tx = null;
		List<Submit> list = null;
		
		try {
		//	sessionFactory = HibernateSessionFactory.getSessionFactory();	
		//	session = sessionFactory.openSession();
			
			//与本地线程绑定的session
			session = HibernateSessionFactory.getSession();
			//开启事务
			tx = session.beginTransaction();
			
			//操作
			session.clear();
			Query query = session.createQuery("from Submit");
			list = query.list();
			
			
			//提交事务
			tx.commit();
		}catch (Exception e) {
			// 回滚事务
			tx.rollback();
			
		}finally {
			//关闭操作
		//	session.close();
	//		return list;
		}
		
	}
}
