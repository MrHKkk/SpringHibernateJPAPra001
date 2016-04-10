package com.kd.test.app.function.service.impl;

import com.kd.test.app.function.dao.CpuDAO;
import com.kd.test.app.function.service.CpuService;
import com.kd.test.app.model.CpuPO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * Created by hksgr on 2016/4/8.
 */
public class CpuServiceImpl implements CpuService {



    private CpuDAO cpuDAO;

    @Override
    public void updateService(int id, Map<String, Object> params) {
        cpuDAO.updateCpu(id, params);
    }


    public void insertService(CpuPO cpu) {
        cpuDAO.insertSingleCpuObj(cpu);

    }

    @Override
    public void deleteService(CpuPO cpu) {
        cpuDAO.deleteSingleCpuObj(cpu);
    }


    @Autowired
    public void setCpuDAO(CpuDAO cpuDAO) {
        this.cpuDAO = cpuDAO;
    }
}
