package com.kd.test.app.function.service;

import com.kd.test.app.model.HardwarePO;

/**
 * Created by hksgr on 2016/4/16.
 */
public interface HardwareService {

    public void addHardware(HardwarePO hardwarePO);

    public void findHardware(HardwarePO hardwarePO);

    public void deleteHardware(HardwarePO hardwarePO);

    public void updateHardware(HardwarePO hardwarePO);
}
