package com.example.OurProject.entity.repository;

import com.example.OurProject.entity.DistributionCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseConnectionRepository extends JpaRepository<DistributionCenter, Long> {
}