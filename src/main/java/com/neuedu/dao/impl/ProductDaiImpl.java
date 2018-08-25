package com.neuedu.dao.impl;

import com.neuedu.dao.ProductDao;
import com.neuedu.entity.CartInfo;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDaiImpl implements ProductDao {


    @Override
    public CartInfo addProduct() {
        System.out.println("======正在添加商品=======");
        return new CartInfo();
    }
}
