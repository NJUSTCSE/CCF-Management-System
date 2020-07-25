package com.njust.dao;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.SessionFactory.HibernateSessionFactory;
import com.njust.entity.Submit;

import org.junit.Test;


public class SubmitDao {
	//提交申请
	public static int submit(Submit submit) {
		
		int flag = 0;
	//	SessionFactory sessionFactory = null;
		Session session = null;
		Transaction tx = null;
		
		try {
		//	sessionFactory = HibernateSessionFactory.getSessionFactory();	
		//	session = sessionFactory.openSession();
			
			//与本地线程绑定的session
			session = HibernateSessionFactory.getSession();
			//开启事务
			tx = session.beginTransaction();
			
			//操作
			session.clear();
			Query query = session.createQuery("from Submit where number = ? and ccf_time = ? and state = ?");
			query.setString(0, submit.getNumber());
			query.setDate(1, submit.getCcfTime());
			query.setString(2, "审核中");
			List<Submit> list = query.list();
			
			if ((list == null || list.size()==0) ) {
				
				session.save(submit);
				
				flag=1;
			}
			
			System.out.println("flag:"+flag);
			
			//提交事务
			tx.commit();
		}catch (Exception e) {
			// 回滚事务
			flag = -1;
			tx.rollback();
			
		}finally {
			//关闭操作
		//	session.close();
			return flag;
		}
		
	}
	
	//处理申请
	public static int dealSubmit(int id, String state) {
		
		int flag = 0;
	//	SessionFactory sessionFactory = null;
		Session session = null;
		Transaction tx = null;
		
		try {
		//	sessionFactory = HibernateSessionFactory.getSessionFactory();	
		//	session = sessionFactory.openSession();
			
			//与本地线程绑定的session
			session = HibernateSessionFactory.getSession();
			//开启事务
			tx = session.beginTransaction();
			
			//操作
			session.clear();
			Submit sub = null;
			sub = session.get(Submit.class, id);
			sub.setState(state);
			session.update(sub);
			flag=1;
			
			System.out.println("flag:"+flag);
			
			//提交事务
			tx.commit();
		}catch (Exception e) {
			// 回滚事务
			tx.rollback();
			
		}finally {
			//关闭操作
		//	session.close();
			return flag;
		}
		
	}
	
	//查找所有申请
	public static List<Submit> findAll() {
		
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
			return list;
		}
		
	}
	
	//查找审核中申请
	public static List<Submit> findWaiting() {
		
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
			Query query = session.createQuery("from Submit where state = ?");
			query.setParameter(0, "审核中");
			list = query.list();
			
			
			//提交事务
			tx.commit();
		}catch (Exception e) {
			// 回滚事务
			tx.rollback();
			
		}finally {
			//关闭操作
		//	session.close();
			return list;
		}
		
	}
	
}
