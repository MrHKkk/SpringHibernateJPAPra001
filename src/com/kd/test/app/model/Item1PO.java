package com.kd.test.app.model;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by hksgr on 2016/4/24.
 */
@Entity
@Table(name="item1")
public class Item1PO {


    private int id;
    private String itemName;
    private Map<String, Image1PO> images = new HashMap<String, Image1PO>();

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ElementCollection
    @CollectionTable(name="IMAGE1", joinColumns=@JoinColumn(name="item_id"))
    @MapKeyColumn(name="FILENAME") //对应字段
    public Map<String, Image1PO> getImages() {
        return images;
    }

    public void setImages(Map<String, Image1PO> images) {
        this.images = images;
    }

    @Column(name="item_name")
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
