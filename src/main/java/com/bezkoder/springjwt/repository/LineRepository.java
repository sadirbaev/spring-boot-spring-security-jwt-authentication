package com.bezkoder.springjwt.repository;

import com.bezkoder.springjwt.models.Factory;
import com.bezkoder.springjwt.models.Line;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LineRepository extends JpaRepository<Line, Integer> {
}
