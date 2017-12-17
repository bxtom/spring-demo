package com.comek.springstarter.demo.service;

import com.comek.springstarter.demo.interfaces.ShopService;
import com.comek.springstarter.demo.model.Shop;
import com.comek.springstarter.demo.repository.ShopsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {
    @Autowired
    private ShopsRepository shopsRepository;

    @Override
    public List<Shop> getAllShops() {
        return shopsRepository.findAll();
    }

    @Override
    public void saveShop(Shop shop) {
        shopsRepository.save(shop);
    }
}
