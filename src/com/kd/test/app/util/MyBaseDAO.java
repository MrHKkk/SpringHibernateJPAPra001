package com.kd.test.app.util;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by hksgr on 2016/4/8.
 */
public class MyBaseDAO {

    private static final Logger logger = Logger.getLogger(MyBaseDAO.class);

    @Autowired
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Session openNewSession() {
        logger.info(sessionFactory.toString());
        return sessionFactory.openSession();
    }

    public Session getSession() {
        logger.info(sessionFactory.toString());
        return sessionFactory.getCurrentSession();
    }



}
