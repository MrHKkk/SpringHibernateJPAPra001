package com.kd.test.app.main;

import com.kd.test.app.function.service.TopicContentService;
import com.kd.test.app.model.TopicContentPO;
import com.kd.test.app.model.TopicPO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * Created by hksgr on 2016/4/18.
 */
public class MainEntryTopicContentDAO {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
        TopicContentService topicContentService = (TopicContentService) ctx.getBean("topicContentService");
        TopicPO topicPO = new TopicPO();
        topicPO.setTopicName("test topic");
        topicPO.setTopicAuthor("MrK");
        topicPO.setTopicDate(sdf.format(new Date()));

        Collection<TopicContentPO> bag = new ArrayList<TopicContentPO>();
        TopicContentPO content = new TopicContentPO();
        content.setTopicAuthor("MrK");
        content.setTopicContent("this is a test");
        bag.add(content);
        topicPO.setContents(bag);
        topicContentService.insertTopic(topicPO);
        System.out.println("done...");
    }
}
