package com.kd.test.app.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by hksgr on 2016/4/16.
 */
@Entity
@DiscriminatorValue("GC")
public class GraphicCardPO extends HardwarePO{

    private String memorySize;
    private String memoryType;
    private String cpuFrequency;
    private String cpuCore;

    @Column(name="memory_size")
    public String getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(String memorySize) {
        this.memorySize = memorySize;
    }

    @Column(name="memory_type")
    public String getMemoryType() {
        return memoryType;
    }

    public void setMemoryType(String memoryType) {
        this.memoryType = memoryType;
    }

    @Column(name="cpu_frequency")
    public String getCpuFrequency() {
        return cpuFrequency;
    }

    public void setCpuFrequency(String cpuFrequency) {
        this.cpuFrequency = cpuFrequency;
    }

    @Column(name="cpu_cores")
    public String getCpuCore() {
        return cpuCore;
    }

    public void setCpuCore(String cpuCore) {
        this.cpuCore = cpuCore;
    }
}
