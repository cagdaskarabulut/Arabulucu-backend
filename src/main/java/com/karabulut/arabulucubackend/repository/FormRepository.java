package com.karabulut.arabulucubackend.repository;

import com.karabulut.arabulucubackend.model.Form;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormRepository extends JpaRepository<Form,Long> {
}
