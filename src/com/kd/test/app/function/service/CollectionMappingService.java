package com.kd.test.app.function.service;

import com.kd.test.app.model.Item1PO;
import com.kd.test.app.model.ItemPO;

/**
 * Created by hksgr on 2016/4/23.
 */
public interface CollectionMappingService {

    public void addItemMappingStringValues(final ItemPO itemPO);

    public void addItemMappingHashSet(final Item1PO item1PO);
}
