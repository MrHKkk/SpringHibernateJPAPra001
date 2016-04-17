package com.kd.test.app.main;

import com.kd.test.app.function.service.HardwareService;
import com.kd.test.app.model.GraphicCardPO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hksgr on 2016/4/16.
 */
public class MainEntryHardwareDAO {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring-config.xml");

        HardwareService service = (HardwareService)ctx.getBean("hardwareService");
//        HardDiskPO hardDiskPO = new HardDiskPO();
//        hardDiskPO.setModelCode("WD1000");
//        hardDiskPO.setModelName("WestDigital-Black");
//        hardDiskPO.setCapacity("1TB");
//        hardDiskPO.setRpm("7200");
//        hardDiskPO.setFirstCahce("512Kb");
//        hardDiskPO.setSecondCache("1024Kb");
//        service.addHardware(hardDiskPO);

//        GraphicCard gcard = new GraphicCard();
//        gcard.setModelName("Gefore GTX-950");
//        gcard.setModelCode("GTX-950");
//        gcard.setMemorySize("2096M");
//        gcard.setMemoryType("GDDR5");
//        gcard.setCpuCore("2");
//        gcard.setCpuFrequency("400MHz");
//        service.addHardware(gcard);

        GraphicCardPO gcard = new GraphicCardPO();
        service.findHardware(gcard);
    }
}
