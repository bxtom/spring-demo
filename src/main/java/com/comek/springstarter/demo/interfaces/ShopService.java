package com.comek.springstarter.demo.interfaces;

import com.comek.springstarter.demo.model.Shop;

import java.util.List;

public interface ShopService {
    List<Shop> getAllShops();

    void saveShop(Shop shop);
}
