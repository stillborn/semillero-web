package edu.unbosque.dao;

// Generated 8/04/2013 05:28:06 PM by Hibernate Tools 4.0.0

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.unbosque.model.Faculties;
import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Faculties.
 * @see edu.unbosque.dao.Faculties
 * @author Hibernate Tools
 */
public class FacultiesHome {

	private static final Log log = LogFactory.getLog(FacultiesHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {			
			return (SessionFactory) new Configuration().configure().buildSessionFactory();					
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException(
					"Could not locate SessionFactory in JNDI " + e.getMessage());
		}
	}

	public void persist(Faculties transientInstance) {
		log.debug("persisting Faculties instance");
		Transaction tx = null;
		try {
		
			tx = sessionFactory.getCurrentSession().beginTransaction();
			
			sessionFactory.getCurrentSession().persist(transientInstance);
			tx.commit();
			log.debug("persist successful");
		} catch (RuntimeException re) {
		
			if(tx != null){
				tx.rollback();
			}
			
			log.error("persist failed", re);
			throw re;
		} finally {			
			sessionFactory.getCurrentSession().close();
		}
	}

	public void attachDirty(Faculties instance) {
		log.debug("attaching dirty Faculties instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Faculties instance) {
		log.debug("attaching clean Faculties instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Faculties persistentInstance) {
		log.debug("deleting Faculties instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Faculties merge(Faculties detachedInstance) {
		log.debug("merging Faculties instance");
		try {
			Faculties result = (Faculties) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Faculties findById(java.lang.Integer id) {
		log.debug("getting Faculties instance with id: " + id);
		try {
			Faculties instance = (Faculties) sessionFactory.getCurrentSession()
					.get("edu.unbosque.dao.Faculties", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
	
	public List<Faculties> findAll() {
		log.debug("finding Faculties instance by example");
				
		Transaction tx = null;
		
		try {			
			tx = sessionFactory.getCurrentSession().beginTransaction();
							
			Query results = sessionFactory
					.getCurrentSession().createQuery("from Faculties");
			
			List<Faculties> listResult = results.list();
			
			log.debug("find by example successful, result size: "
					+ listResult.size());
			
			tx.commit();
			
			return listResult;
		} catch (RuntimeException re) {
			
			if(tx != null){
				tx.rollback();
			}
			
			log.error("find by example failed", re);
			throw re;
		} finally {			
			sessionFactory.getCurrentSession().close();
		}
	}
}
