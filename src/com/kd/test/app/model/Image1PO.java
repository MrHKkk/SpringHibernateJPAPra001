package com.kd.test.app.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;

/**
 * Created by hksgr on 2016/4/24.
 */

@Embeddable
@Table(name="IMAGE1")
public class Image1PO {



    @Column(name="title", nullable = true)
    private String title;



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
