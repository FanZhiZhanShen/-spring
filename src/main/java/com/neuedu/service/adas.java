package com.neuedu.service;

import com.neuedu.entity.CartInfo;



public class adas {
    private String  name;

    private CartInfo cartInfo;


    public String getName() {
        return name;
    }

    public CartInfo getCartInfo() {
        return cartInfo;
    }



    public adas() {

    }

    public adas(CartInfo cartInfo) {

        this.cartInfo = cartInfo;
    }

    public adas(String name) {
        this.name = name;

    }

    public adas(String name, CartInfo cartInfo) {
        this.name = name;
        this.cartInfo = cartInfo;
    }

    public  void init(){

    }
    public  void destroy(){

    }
}
