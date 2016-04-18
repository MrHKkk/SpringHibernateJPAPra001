package com.kd.test.app.function.dao.impl;

import com.kd.test.app.function.dao.HardwareDAO;
import com.kd.test.app.model.HardwarePO;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

/**
 * Created by hksgr on 2016/4/16.
 */

public class HardwareDAOImpl extends HibernateDaoSupport implements HardwareDAO {

    @Autowired
    public void setSessionFactory0(SessionFactory sessionFactory) {
        setSessionFactory(sessionFactory);
    }

    @Override
    public void addHardware(HardwarePO hardwarePO) {
        this.getHibernateTemplate().persist(hardwarePO);
    }

    @Override
    public void findHardware(HardwarePO hardwarePO) {
        this.getHibernateTemplate().executeWithNativeSession(new HibernateCallback<Object>() {

            @Override
            public Object doInHibernate(Session session) throws HibernateException {
                Query query = session.createQuery("SELECT h.modelCode FROM GraphicCardPO  h");
                query.list();
                return null;
            }
        });
    }

    @Override
    public void deleteHardware(HardwarePO hardwarePO) {

    }

    @Override
    public void updateHardware(HardwarePO hardwarePO) {

    }
}
