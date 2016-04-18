package com.kd.test.app.function.service.impl;

import com.kd.test.app.function.dao.TopicContentDAO;
import com.kd.test.app.function.service.TopicContentService;
import com.kd.test.app.model.TopicPO;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by hksgr on 2016/4/18.
 */
public class TopicContentServiceImpl implements TopicContentService {

    @Autowired
    private TopicContentDAO topicContentDAO;

    public void setTopicContentDAO(TopicContentDAO topicContentDAO) {
        this.topicContentDAO = topicContentDAO;
    }


    @Override
    public void insertTopic(TopicPO topicPO) {
        topicContentDAO.insertTopic(topicPO);
    }

    @Override
    public void deleteTopic(TopicPO topicPO) {

    }

    @Override
    public void findAllTopic() {

    }
}
