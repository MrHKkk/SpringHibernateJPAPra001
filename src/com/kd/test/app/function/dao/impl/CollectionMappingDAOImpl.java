package com.kd.test.app.function.dao.impl;

import com.kd.test.app.function.dao.CollectionMappingDAO;
import com.kd.test.app.model.Item1PO;
import com.kd.test.app.model.ItemPO;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;



/**
 * Created by hksgr on 2016/4/23.
 */
public class CollectionMappingDAOImpl extends HibernateDaoSupport implements CollectionMappingDAO {

    @Autowired
    public void setSessionFactory0(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }


    @Override
    public void addItemMappingStringValues(final ItemPO itemPO) {
        this.getHibernateTemplate().executeWithNativeSession(new HibernateCallback<Object>() {
            @Override
            public Object doInHibernate(Session session) throws HibernateException {
                session.persist(itemPO);
                return null;
            }
        });
    }

    @Override
    public void addItemMappingHashSet(final Item1PO item1PO) {
        this.getHibernateTemplate().executeWithNativeSession(new HibernateCallback<Object>() {
            @Override
            public Object doInHibernate(Session session) throws HibernateException {
                session.persist(item1PO);
                return null;
            }
        });
    }

}
