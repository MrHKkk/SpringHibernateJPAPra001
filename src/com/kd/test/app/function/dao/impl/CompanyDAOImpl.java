package com.kd.test.app.function.dao.impl;

import com.kd.test.app.function.dao.CompanyDAO;
import com.kd.test.app.model.CompanyPO;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

/**
 * Created by hksgr on 2016/4/12.
 */
public class CompanyDAOImpl extends HibernateDaoSupport implements CompanyDAO {

    @Autowired
    public void setSessionFactory0(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }


    public void deleteCompany(CompanyPO company) {

    }


    public void addCompany(CompanyPO company){
        this.getHibernateTemplate().persist(company);
    }

    public CompanyPO findCompany() {
        return this.getHibernateTemplate().get(CompanyPO.class, 1);
    }

}
