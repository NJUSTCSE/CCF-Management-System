package com.njust.entity;

import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * FormalExam entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.njust.entity.FormalExam
 * @author MyEclipse Persistence Tools
 */
public class FormalExamDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(FormalExamDAO.class);
	// property constants
	public static final String NAME = "name";
	public static final String GRADE = "grade";
	public static final String TOTAL_SCORE = "totalScore";
	public static final String FIRST_SCORE = "firstScore";
	public static final String SECOND_SCORE = "secondScore";
	public static final String THIRD_SCORE = "thirdScore";
	public static final String FOURTH_SCORE = "fourthScore";
	public static final String FIFTH_SCORE = "fifthScore";

	public void save(FormalExam transientInstance) {
		log.debug("saving FormalExam instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FormalExam persistentInstance) {
		log.debug("deleting FormalExam instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FormalExam findById(com.njust.entity.FormalExamId id) {
		log.debug("getting FormalExam instance with id: " + id);
		try {
			FormalExam instance = (FormalExam) getSession().get("com.njust.entity.FormalExam", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FormalExam instance) {
		log.debug("finding FormalExam instance by example");
		try {
			List results = getSession().createCriteria("com.njust.entity.FormalExam").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding FormalExam instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from FormalExam as model where model." + propertyName + "= ?";
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

	public List findByGrade(Object grade) {
		return findByProperty(GRADE, grade);
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

	public List findAll() {
		log.debug("finding all FormalExam instances");
		try {
			String queryString = "from FormalExam";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FormalExam merge(FormalExam detachedInstance) {
		log.debug("merging FormalExam instance");
		try {
			FormalExam result = (FormalExam) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FormalExam instance) {
		log.debug("attaching dirty FormalExam instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FormalExam instance) {
		log.debug("attaching clean FormalExam instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}