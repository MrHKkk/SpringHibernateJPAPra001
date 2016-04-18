package com.kd.test.app.function.dao.impl;

import com.kd.test.app.function.dao.TopicContentDAO;
import com.kd.test.app.model.TopicPO;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;


/**
 * Created by hksgr on 2016/4/18.
 */
public class TopicContentDAOImpl extends HibernateDaoSupport implements TopicContentDAO {


    @Autowired
    public void setSessionFactory0(SessionFactory sessionFactory) {
        this.setSessionFactory(sessionFactory);
    }


    @Override
    public void insertTopic(TopicPO topicPO) {
        this.getHibernateTemplate().persist(topicPO);
    }

    @Override
    public void deleteTopic(TopicPO topicPO) {

    }

    @Override
    public void findAllTopic() {

    }
}
