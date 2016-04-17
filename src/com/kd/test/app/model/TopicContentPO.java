package com.kd.test.app.model;

import javax.persistence.Embeddable;

/**
 * Created by hksgr on 2016/4/17.
 */
@Embeddable
public class TopicContentPO {

    protected String topicContent;
    protected String topicAuthor;

    public String getTopicContent() {
        return topicContent;
    }

    public void setTopicContent(String topicContent) {
        this.topicContent = topicContent;
    }

    public String getTopicAuthor() {
        return topicAuthor;
    }

    public void setTopicAuthor(String topicAuthor) {
        this.topicAuthor = topicAuthor;
    }
}

