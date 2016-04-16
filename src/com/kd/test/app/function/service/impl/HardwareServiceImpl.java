package com.kd.test.app.function.service.impl;

import com.kd.test.app.function.dao.HardwareDAO;
import com.kd.test.app.function.service.HardwareService;
import com.kd.test.app.model.HardwarePO;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by hksgr on 2016/4/16.
 */
public class HardwareServiceImpl implements HardwareService {


    private HardwareDAO hardwareDAO;

    @Autowired
    public void setHardwareDAO(HardwareDAO hardwareDAO) {
        this.hardwareDAO = hardwareDAO;
    }

    @Override
    public void addHardware(HardwarePO hardwarePO) {
        hardwareDAO.addHardware(hardwarePO);
    }

    @Override
    public void findHardware(HardwarePO hardwarePO) {
        hardwareDAO.findHardware(hardwarePO);
    }

    @Override
    public void deleteHardware(HardwarePO hardwarePO) {

    }

    @Override
    public void updateHardware(HardwarePO hardwarePO) {

    }
}
