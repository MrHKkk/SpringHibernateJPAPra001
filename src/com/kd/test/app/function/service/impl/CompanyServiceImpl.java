package com.kd.test.app.function.service.impl;

import com.kd.test.app.function.dao.CompanyDAO;
import com.kd.test.app.function.service.CompanyService;
import com.kd.test.app.model.CompanyPO;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by hksgr on 2016/4/12.
 */
public class CompanyServiceImpl implements CompanyService {

    public CompanyDAO companyDAO;


    @Autowired
    public void setCompanyDAO(CompanyDAO companyDAO) {
        this.companyDAO = companyDAO;
    }

    @Override
    public void addCompany(CompanyPO companyPO) {
        companyDAO.addCompany(companyPO);
    }

    @Override
    public void deleteCompany(CompanyPO companyPO) {

    }

    public CompanyPO findCompany() {
        return companyDAO.findCompany();
    }

}
