package com.ecom.api.repositary;

import com.ecom.api.entity.Price;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepo extends JpaRepository<Price,Integer> {
}
