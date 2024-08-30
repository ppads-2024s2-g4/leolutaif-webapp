package com.leolutaif.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  BusinessRepository extends JpaRepository<Employee, Long> {
}
