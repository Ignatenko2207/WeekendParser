package org.itstep.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.itstep.model.Item;
import org.itstep.util.HibernateUtil;

public class ItemDAO {

	private Session session;
	
	public void save(Item item) {
		
		session = HibernateUtil.getSessionFactory().openSession();
		
		session.getTransaction().begin();
		
		session.save(item);
		
		session.getTransaction().commit();
		
		session.close();
	}
	
	public List<Item> getAll() {
		
		session = HibernateUtil.getSessionFactory().openSession();
		
		session.getTransaction().begin();
		
		String sql = "SELECT * FROM items";
		
		Query query = session.createNativeQuery(sql);
		
		List<Item> result = query.getResultList();
				
		session.getTransaction().commit();
		
		session.close();
		
		return result;
	}
}