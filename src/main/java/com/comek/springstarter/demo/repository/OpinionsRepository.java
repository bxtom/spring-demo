package com.comek.springstarter.demo.repository;

import com.comek.springstarter.demo.model.Opinion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OpinionsRepository extends JpaRepository<Opinion, Long> {
}
