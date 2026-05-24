package com.example.cycle_price.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cycle_price.entity.Price;

public interface PriceRepository extends JpaRepository<Price, Long>{

}
