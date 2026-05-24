package com.example.cycle_price.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cycle_price.entity.Part;

public interface PartRepository extends JpaRepository<Part, Long>{

}
