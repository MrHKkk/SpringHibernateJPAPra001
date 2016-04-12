package com.kd.test.app.function.service;

import com.kd.test.app.model.CompanyPO;

/**
 * Created by hksgr on 2016/4/12.
 */
public interface CompanyService {

    public void addCompany(CompanyPO companyPO);

    public void deleteCompany(CompanyPO companyPO);

    public CompanyPO findCompany();
}
