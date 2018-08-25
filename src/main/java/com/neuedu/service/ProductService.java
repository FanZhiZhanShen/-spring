package com.neuedu.service;

import com.neuedu.dao.ProductDao;
import com.neuedu.entity.CartInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ProductService implements IProductService{

    @Autowired
    private ProductDao productDao;
    @Override
    public CartInfo addProduct(int i, String name)  {
        CartInfo cartInfo= productDao.addProduct();

//            throw new IOException();
        return cartInfo;
    }
}
