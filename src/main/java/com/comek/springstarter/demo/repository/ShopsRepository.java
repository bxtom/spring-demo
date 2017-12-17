package com.comek.springstarter.demo.repository;

import com.comek.springstarter.demo.model.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopsRepository extends JpaRepository<Shop, Long> {
}
