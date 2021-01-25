package com.bezkoder.springjwt.repository;

import com.bezkoder.springjwt.models.Factory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactoryRepository extends JpaRepository<Factory, Integer> {
}
