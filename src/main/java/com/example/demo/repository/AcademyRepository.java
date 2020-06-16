package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.domain.Academy;

public interface AcademyRepository extends JpaRepository<Academy, Long>{

}
