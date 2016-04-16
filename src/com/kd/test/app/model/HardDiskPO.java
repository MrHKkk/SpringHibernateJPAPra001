package com.kd.test.app.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by hksgr on 2016/4/16.
 */
@Entity
@DiscriminatorValue("HD")
public class HardDiskPO extends HardwarePO {


    private String rpm;
    private String capacity;
    private int inventory;
    private String firstCahce;
    private String secondCache;


    @Column(name="rpm")
    public String getRpm() {
        return rpm;
    }

    public void setRpm(String rpm) {
        this.rpm = rpm;
    }

    @Column(name="capacity")
    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    @Column(name="inventory")
    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    @Column(name="l1_cache")
    public String getFirstCahce() {
        return firstCahce;
    }

    public void setFirstCahce(String firstCahce) {
        this.firstCahce = firstCahce;
    }

    @Column(name="l2_cache")
    public String getSecondCache() {
        return secondCache;
    }

    public void setSecondCache(String secondCache) {
        this.secondCache = secondCache;
    }
}
