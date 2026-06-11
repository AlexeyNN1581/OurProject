package com.example.OurProject.entity.reposetory;

import com.example.OurProject.entity.BaseConnection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseConnectionRepository extends JpaRepository<BaseConnection, Long> {
}