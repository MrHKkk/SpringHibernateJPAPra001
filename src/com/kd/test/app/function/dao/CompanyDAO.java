package com.kd.test.app.function.dao;

import com.kd.test.app.model.CompanyPO;

/**
 * Created by hksgr on 2016/4/12.
 */
public interface CompanyDAO {

    public void deleteCompany(CompanyPO company);

    public void addCompany(CompanyPO company);

    public CompanyPO findCompany();
}
