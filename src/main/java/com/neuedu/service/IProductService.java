package com.neuedu.service;

import com.neuedu.entity.CartInfo;

import java.io.IOException;

public interface IProductService {

    public CartInfo addProduct(int i, String name)throws Exception;
}
