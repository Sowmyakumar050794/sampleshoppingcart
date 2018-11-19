package com.teamsankya.sampleshoppingcart.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.teamsankya.sampleshoppingcart.dto.ProductsBean;
//@Service
@Repository
public class ProductDAOImpl implements ProductDAO {
	/*
	public static final Configuration CONFIG = new Configuration();
	public static final SessionFactory FACTORY = CONFIG.configure().buildSessionFactory();*/
	final static Logger LOGGER = Logger.getLogger(ProductDAOImpl.class);
	@Autowired
	//@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;

	public List<ProductsBean> search(String name) {
		LOGGER.info("inside search method");
	Configuration configuration = new Configuration();
	System.out.println("after conf");
		LOGGER.info("After configure");
		System.out.println("inside search method");
		SessionFactory factory = configuration.configure().buildSessionFactory();
		System.out.println("after factory");
		Session session = factory.openSession();
		LOGGER.info("after session");
		Transaction transaction=factory.openSession().beginTransaction();
		
		Criteria criteria = session.createCriteria(ProductsBean.class);
		criteria.add(Restrictions.like("fullName", ("%"+name+"%")));
		List<ProductsBean> res = criteria.list();
		
		/*String hql = "From DetailsId where fullName like "+name;
		Query query = session.createQuery(hql);
		List<DetailsBean> res = query.list();*/
		transaction.commit();
		session.close();
		return res;
	}
	
	
	

}
