package com.kd.test.app.function.service;

import com.kd.test.app.model.CpuPO;

import java.util.Map;

/**
 * Created by hksgr on 2016/4/8.
 */
public interface CpuService {

    public void updateService(int id, Map<String, Object> params);

    public void insertService(final CpuPO cpu);

    public void deleteService(final CpuPO cpu);

    public void deleteCpuByHQL();
}
