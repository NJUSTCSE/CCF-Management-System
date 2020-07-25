package com.njust.entity;

import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * Analysis entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.njust.entity.Analysis
 * @author MyEclipse Persistence Tools
 */
public class AnalysisDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(AnalysisDAO.class);
	// property constants
	public static final String AVERAGE = "average";
	public static final String POSTGRADUATE_LINE = "postgraduateLine";
	public static final String HIGH_LINE = "highLine";
	public static final String FIRST_AVE = "firstAve";
	public static final String SECOND_AVE = "secondAve";
	public static final String THIRD_AVE = "thirdAve";
	public static final String FOURTH_AVE = "fourthAve";
	public static final String FIFTH_AVE = "fifthAve";

	public void save(Analysis transientInstance) {
		log.debug("saving Analysis instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Analysis persistentInstance) {
		log.debug("deleting Analysis instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Analysis findById(java.util.Date id) {
		log.debug("getting Analysis instance with id: " + id);
		try {
			Analysis instance = (Analysis) getSession().get("com.njust.entity.Analysis", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Analysis instance) {
		log.debug("finding Analysis instance by example");
		try {
			List results = getSession().createCriteria("com.njust.entity.Analysis").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Analysis instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Analysis as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByAverage(Object average) {
		return findByProperty(AVERAGE, average);
	}

	public List findByPostgraduateLine(Object postgraduateLine) {
		return findByProperty(POSTGRADUATE_LINE, postgraduateLine);
	}

	public List findByHighLine(Object highLine) {
		return findByProperty(HIGH_LINE, highLine);
	}

	public List findByFirstAve(Object firstAve) {
		return findByProperty(FIRST_AVE, firstAve);
	}

	public List findBySecondAve(Object secondAve) {
		return findByProperty(SECOND_AVE, secondAve);
	}

	public List findByThirdAve(Object thirdAve) {
		return findByProperty(THIRD_AVE, thirdAve);
	}

	public List findByFourthAve(Object fourthAve) {
		return findByProperty(FOURTH_AVE, fourthAve);
	}

	public List findByFifthAve(Object fifthAve) {
		return findByProperty(FIFTH_AVE, fifthAve);
	}

	public List findAll() {
		log.debug("finding all Analysis instances");
		try {
			String queryString = "from Analysis";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Analysis merge(Analysis detachedInstance) {
		log.debug("merging Analysis instance");
		try {
			Analysis result = (Analysis) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Analysis instance) {
		log.debug("attaching dirty Analysis instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Analysis instance) {
		log.debug("attaching clean Analysis instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}