package com.kd.test.app.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by hksgr on 2016/4/23.
 *
 * 一对多关联，其中一张表使用复合主键。使用HashSet作为存储对象。（使用String类型表示关联的存储对象，不需要再创建POJO对象。）
 *
 */
@Entity
@Table(name="item")
public class ItemPO {

    private int id;
    private String itemName;
    protected Set<String> images = new HashSet<String>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="item_name")
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @ElementCollection
    @CollectionTable(name="IMAGE", joinColumns = @JoinColumn(name="ITEM_ID")) //name为被关联表名， joinColumns为关联表名主键
    @Column(name="filename") //被关联表的列名称(多的一方)
    public Set<String> getImages() {
        return images;
    }

    public void setImages(Set<String> images) {
        this.images = images;
    }
}
