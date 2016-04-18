package com.kd.test.app.function.service;

import com.kd.test.app.model.TopicPO;

/**
 * Created by hksgr on 2016/4/18.
 */
public interface TopicContentService {

    public void insertTopic(TopicPO topicPO);

    public void deleteTopic(TopicPO topicPO);

    public void findAllTopic();
}
