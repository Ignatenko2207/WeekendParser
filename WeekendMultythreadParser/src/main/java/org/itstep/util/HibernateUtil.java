package org.itstep.util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sessionFactory = configureSessionFactory();

	/**
	 * Create SessionFactory
	 *
	 * @return {@link SessionFactory}
	 * @throws HibernateException
	 */
	private static SessionFactory configureSessionFactory() throws HibernateException {

		Configuration configuration = new Configuration();
		return configuration.buildSessionFactory();

	}

	/**
	 * Get SessionFactory
	 *
	 * @return {@link SessionFactory}
	 */
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}