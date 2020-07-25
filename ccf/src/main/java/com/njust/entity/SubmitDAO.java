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
 * Submit entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.njust.entity.Submit
 * @author MyEclipse Persistence Tools
 */
public class SubmitDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(SubmitDAO.class);
	// property constants
	public static final String NUMBER = "number";
	public static final String TOTAL_SCORE = "totalScore";
	public static final String FIRST_SCORE = "firstScore";
	public static final String SECOND_SCORE = "secondScore";
	public static final String THIRD_SCORE = "thirdScore";
	public static final String FOURTH_SCORE = "fourthScore";
	public static final String FIFTH_SCORE = "fifthScore";
	public static final String IMG = "img";
	public static final String STATE = "state";

	public void save(Submit transientInstance) {
		log.debug("saving Submit instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Submit persistentInstance) {
		log.debug("deleting Submit instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Submit findById(java.lang.Integer id) {
		log.debug("getting Submit instance with id: " + id);
		try {
			Submit instance = (Submit) getSession().get("com.njust.entity.Submit", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Submit instance) {
		log.debug("finding Submit instance by example");
		try {
			List results = getSession().createCriteria("com.njust.entity.Submit").add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Submit instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Submit as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByNumber(Object number) {
		return findByProperty(NUMBER, number);
	}

	public List findByTotalScore(Object totalScore) {
		return findByProperty(TOTAL_SCORE, totalScore);
	}

	public List findByFirstScore(Object firstScore) {
		return findByProperty(FIRST_SCORE, firstScore);
	}

	public List findBySecondScore(Object secondScore) {
		return findByProperty(SECOND_SCORE, secondScore);
	}

	public List findByThirdScore(Object thirdScore) {
		return findByProperty(THIRD_SCORE, thirdScore);
	}

	public List findByFourthScore(Object fourthScore) {
		return findByProperty(FOURTH_SCORE, fourthScore);
	}

	public List findByFifthScore(Object fifthScore) {
		return findByProperty(FIFTH_SCORE, fifthScore);
	}

	public List findByImg(Object img) {
		return findByProperty(IMG, img);
	}

	public List findByState(Object state) {
		return findByProperty(STATE, state);
	}

	public List findAll() {
		log.debug("finding all Submit instances");
		try {
			String queryString = "from Submit";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Submit merge(Submit detachedInstance) {
		log.debug("merging Submit instance");
		try {
			Submit result = (Submit) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Submit instance) {
		log.debug("attaching dirty Submit instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Submit instance) {
		log.debug("attaching clean Submit instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}