package com.karabulut.arabulucubackend.repository;

import com.karabulut.arabulucubackend.model.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDataRepository extends JpaRepository<UserData,Long> {
}
