package com.kd.test.app.main;


import com.kd.test.app.function.service.CollectionMappingService;
import com.kd.test.app.model.Image1PO;
import com.kd.test.app.model.Item1PO;
import com.kd.test.app.model.ItemPO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by hksgr on 2016/4/23.
 */
public class MainEntryCollectionMapping {


    public static void main(String[] args) {
        ApplicationContext appCtx = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
        CollectionMappingService service = (CollectionMappingService) appCtx.getBean("collectionMappingService");

//        ItemPO item = new ItemPO();
//        Set<String> image = new HashSet<String>();
//        item.setItemName("itemA");
//        image.add("app.jpg");
//        image.add("ccc.jpg");
//        image.add("bbb.jpg");
//        item.setImages(image);
//        service.addItemMappingStringValues(item);

        Item1PO item1PO = new Item1PO();
        item1PO.setItemName("item1");
        Map<String, Image1PO> images = new HashMap<String, Image1PO>();
        for(int i = 0; i < 3; i++) {
            Image1PO image1 = new Image1PO();
            image1.setTitle("title " + i);
            images.put("a" + i + ".jpg", image1);

        }
        item1PO.setImages(images);
        service.addItemMappingHashSet(item1PO);
    }
}
