package com.kd.test.app.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;

/**
 * Created by hksgr on 2016/4/17.
 */
@Embeddable
@Table(name="topic_content")
public class TopicContentPO {

    protected String topicContent;
    protected String topicAuthor;

    @Column(name="topic_content")
    public String getTopicContent() {
        return topicContent;
    }

    public void setTopicContent(String topicContent) {
        this.topicContent = topicContent;
    }

    @Column(name="topic_author")
    public String getTopicAuthor() {
        return topicAuthor;
    }

    public void setTopicAuthor(String topicAuthor) {
        this.topicAuthor = topicAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TopicContentPO that = (TopicContentPO) o;

        if (topicContent != null ? !topicContent.equals(that.topicContent) : that.topicContent != null) return false;
        return topicAuthor != null ? topicAuthor.equals(that.topicAuthor) : that.topicAuthor == null;

    }

    @Override
    public int hashCode() {
        int result = topicContent != null ? topicContent.hashCode() : 0;
        result = 31 * result + (topicAuthor != null ? topicAuthor.hashCode() : 0);
        return result;
    }
}

