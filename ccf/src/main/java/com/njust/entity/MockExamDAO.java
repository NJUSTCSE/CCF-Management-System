package com.njust.entity;

import java.util.Date;
import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * MockExam entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.njust.entity.MockExam
 * @author MyEclipse Persistence Tools
 */
public class MockExamDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(MockExamDAO.class);
	// property constants
	public static final String NAME = "name";
	public static final String ID_NUMBER = "idNumber";
	public static final String GRADE = "grade";
	public static final String DIRECT_TIMES = "directTimes";
	public static final String HIGH_TIMES = "highTimes";
	public static final String PRIORITY = "priority";
	public static final String SCORE = "score";
	public static final String STATE = "state";
	public static final String IS_IN = "isIn";

	public void save(MockExam transientInstance) {
		log.debug("saving MockExam instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(MockExam persistentInstance) {
		log.debug("deleting MockExam instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public MockExam findById(com.njust.entity.MockExamId id) {
		log.debug("getting MockExam instance with id: " + id);
		try {
			MockExam instance = (MockExam) getSession().get("com.njust.entity.MockExam", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(MockExam instance) {
		log.debug("finding MockExam instance by example");
		try {
			List results = getSession().createCriteria("com.njust.entity.MockExam").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding MockExam instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from MockExam as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List findByIdNumber(Object idNumber) {
		return findByProperty(ID_NUMBER, idNumber);
	}

	public List findByGrade(Object grade) {
		return findByProperty(GRADE, grade);
	}

	public List findByDirectTimes(Object directTimes) {
		return findByProperty(DIRECT_TIMES, directTimes);
	}

	public List findByHighTimes(Object highTimes) {
		return findByProperty(HIGH_TIMES, highTimes);
	}

	public List findByPriority(Object priority) {
		return findByProperty(PRIORITY, priority);
	}

	public List findByScore(Object score) {
		return findByProperty(SCORE, score);
	}

	public List findByState(Object state) {
		return findByProperty(STATE, state);
	}

	public List findByIsIn(Object isIn) {
		return findByProperty(IS_IN, isIn);
	}

	public List findAll() {
		log.debug("finding all MockExam instances");
		try {
			String queryString = "from MockExam";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public MockExam merge(MockExam detachedInstance) {
		log.debug("merging MockExam instance");
		try {
			MockExam result = (MockExam) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(MockExam instance) {
		log.debug("attaching dirty MockExam instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MockExam instance) {
		log.debug("attaching clean MockExam instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}