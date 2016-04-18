package com.kd.test.app.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by hksgr on 2016/4/17.
 */
@Entity
@Table(name="topics")
public class TopicPO {


    protected int id;
    protected String topicName;
    protected String topicAuthor;
    protected String topicDate;
    protected String category;

    protected Collection<TopicContentPO> contents = new ArrayList<TopicContentPO>();


    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="topic_name")
    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    @Column(name="topic_author")
    public String getTopicAuthor() {
        return topicAuthor;
    }

    public void setTopicAuthor(String topicAuthor) {
        this.topicAuthor = topicAuthor;
    }

    @Column(name="topic_date")
    public String getTopicDate() {
        return topicDate;
    }

    public void setTopicDate(String topicDate) {
        this.topicDate = topicDate;
    }

    @Column(name="category")
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    @ElementCollection
    @CollectionTable(name="topic_content", joinColumns = @JoinColumn(name="topic_id"))
    //@JoinTable(name="topic_content", joinColumns = @JoinColumn(name="topic_id"))
    @GenericGenerator(name="hilogen",strategy="increment")
    @org.hibernate.annotations.CollectionId(columns = @Column(name="content_id"),
            type=@org.hibernate.annotations.Type(type="long"),
            generator = "hilogen")
    public Collection<TopicContentPO> getContents() {
        return contents;
    }

    public void setContents(Collection<TopicContentPO> contents) {
        this.contents = contents;
    }
}
