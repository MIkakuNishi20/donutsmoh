package com.crumb.backend.repository;

import com.crumb.backend.model.Donut;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonutRepository extends JpaRepository<Donut, Long> {
}
