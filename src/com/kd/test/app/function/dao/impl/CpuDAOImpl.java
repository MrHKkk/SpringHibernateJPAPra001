package com.kd.test.app.function.dao.impl;

import com.kd.test.app.function.dao.CpuDAO;
import com.kd.test.app.model.CpuPO;
import com.kd.test.app.util.MyBaseDAO;
import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;


import java.util.Map;

/**
 * Created by hksgr on 2016/4/8.
 */
public class CpuDAOImpl extends HibernateDaoSupport implements CpuDAO {


    @Autowired
    public void setSessionFactory0(SessionFactory sessionFactory) {
        setSessionFactory(sessionFactory);
    }


    public void updateCpu(final int id, final Map<String, Object> params) {
//        CpuPO cpu = new CpuPO();
//        cpu.setId(id);
//        cpu.setL1Cache("4*32 bytes");
//        cpu.setL2Cache("4*32 bytes");
//        Session session = this.getSessionFactory().openSession();
//        session.update(cpu);
//        session.flush();
//        session.close();
    }


    public void updateCpuByHQL(final int id, final Map<String, Object> params) {
        this.getHibernateTemplate().executeWithNativeSession(new HibernateCallback<Object>() {

            @Override
            public Object doInHibernate(Session session) throws HibernateException {
                StringBuilder hql = new StringBuilder();
                hql.append("UPDATE CpuPO T SET ");
                Query query = session.createQuery(hql.toString());
                query.executeUpdate();
                return null;
            }
        });
//        Session session = super.getSession();
//        session.beginTransaction();
//        Query query = session.createQuery("UPDATE CpuPO T SET T.instruction = 'mmx' ");
//        query.executeUpdate();
//        session.getTransaction().commit();

    }

    public void insertSingleCpuObj(final CpuPO cpu) {
        //Session session = super.getSession();
        //session.beginTransaction();
        //session.persist(cpu);
        //session.getTransaction().commit();

        this.getHibernateTemplate().save(cpu);

//        this.getHibernateTemplate().executeWithNativeSession(new HibernateCallback<Object>() {
//            @Override
//            public Object doInHibernate(Session session) throws HibernateException {
//                session.persist(cpu);
//                return null;
//            }
//        });
    }

    @Override
    public void deleteSingleCpuObj(final CpuPO cpu) {
        this.getHibernateTemplate().delete(cpu);
    }





}
