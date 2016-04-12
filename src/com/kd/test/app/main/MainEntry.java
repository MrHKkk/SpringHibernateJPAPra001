package com.kd.test.app.main;

import com.kd.test.app.function.dao.CpuDAO;
import com.kd.test.app.function.service.CpuService;
import com.kd.test.app.model.CpuPO;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTransactionManager;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.TransactionStatus;

/**
 * Created by hksgr on 2016/4/8.
 */
public class MainEntry {

    public static void main(String[] args) {
        ApplicationContext appCtx = new ClassPathXmlApplicationContext("classpath:spring-config.xml");

//        CpuDAO dao =(CpuDAO) appCtx.getBean("cpuDAO");
//        dao.updateCpu(2);

        CpuService service = (CpuService)appCtx.getBean("cpuService");

//            CpuDAO dao = (CpuDAO)appCtx.getBean("cpuDAO");
//            dao.updateCpuByHQL();
//            CpuPO cpu = new CpuPO();
//            cpu.setCpuName("Intel Core i7 4970k");
//            cpu.setBusSpeed("100MHz");
//            cpu.setMultiplier("15-40");
//            cpu.setL1Cache("4*64 KBytes");
//            cpu.setL2Cache("4*64 KBytes");
//            dao.insertSingleCpuObj(cpu);

//            service.insertService(cpu);
        service.deleteCpuByHQL();

//        SessionFactory sessionFactory = (SessionFactory) appCtx.getBean("sessionFactory");
//        HibernateTransactionManager txManager = new HibernateTransactionManager();
//        txManager.setSessionFactory(sessionFactory);
//        Session session = sessionFactory.openSession();
//        CpuPO cpu = new CpuPO();
//        cpu.setCpuName("Intel Xeon E3 1230 v3");
//        cpu.setBusSpeed("100 MHZ");
//        cpu.setMultiplier("8-37");
//        cpu.setCoreSpeed("3300max");
//        session.persist(cpu);
//        session.flush();
//        session.close();
    }
}
