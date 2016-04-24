package com.kd.test.app.function.service.impl;

import com.kd.test.app.function.dao.CollectionMappingDAO;
import com.kd.test.app.function.service.CollectionMappingService;
import com.kd.test.app.model.Item1PO;
import com.kd.test.app.model.ItemPO;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by hksgr on 2016/4/23.
 */
public class CollectionMappingServiceImpl implements CollectionMappingService{




    private CollectionMappingDAO collectionMappingDAO;

    @Override
    public void addItemMappingStringValues(final ItemPO itemPO) {
        collectionMappingDAO.addItemMappingStringValues(itemPO);
    }

    @Override
    public void addItemMappingHashSet(final Item1PO item1PO) {
        collectionMappingDAO.addItemMappingHashSet(item1PO);
    }


    @Autowired
    public void setCollectionMappingDAO(CollectionMappingDAO collectionMappingDAO) {
        this.collectionMappingDAO = collectionMappingDAO;
    }

}
