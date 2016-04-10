package com.kd.test.app.function.dao;

import com.kd.test.app.model.CpuPO;

import java.util.Map;

/**
 * Created by hksgr on 2016/4/8.
 */
public interface CpuDAO {

    public void updateCpu(final int id, final Map<String, Object> params);

    public void updateCpuByHQL(final int id, final Map<String, Object> params);

    public void insertSingleCpuObj(final CpuPO cpu);

    public void deleteSingleCpuObj(final CpuPO cpu);
}
