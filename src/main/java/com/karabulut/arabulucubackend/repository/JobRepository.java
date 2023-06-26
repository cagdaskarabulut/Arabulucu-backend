package com.karabulut.arabulucubackend.repository;

import com.karabulut.arabulucubackend.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job,Long> {
}
