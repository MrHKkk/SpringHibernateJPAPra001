package com.kd.test.app.main;

import com.kd.test.app.function.dao.CompanyDAO;
import com.kd.test.app.function.service.CompanyService;
import com.kd.test.app.model.CompanyPO;
import com.kd.test.app.model.CpuPO;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Iterator;


/**
 * Created by hksgr on 2016/4/12.
 */
public class MainEntryCompanyDAO {

    private static final Logger logger = Logger.getLogger(MainEntryCompanyDAO.class);

    public static void main(String[] args) {

        ApplicationContext appCtx = new ClassPathXmlApplicationContext("classpath:spring-config.xml");

//        CompanyPO companyPO = new CompanyPO();

//        companyPO.setCompanyCode("0010010015");
//        companyPO.setCompanyName("Intel");
//        companyPO.setLocation("UAS");
//        companyPO.setCategory("1");
//
        CompanyService companyService = (CompanyService) appCtx.getBean("companyService");
//        companyService.addCompany(companyPO);

        CompanyPO companyPO = companyService.findCompany();
        Iterator iter = companyPO.getCpuProducts().iterator();
        while(iter.hasNext()) {
            CpuPO cpu = (CpuPO) iter.next();
            logger.info(cpu.getCpuName());
        }
    }
}
