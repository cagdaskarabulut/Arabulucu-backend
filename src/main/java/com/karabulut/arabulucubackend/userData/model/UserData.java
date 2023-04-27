package com.karabulut.arabulucubackend.userData.model;

import java.time.LocalDateTime;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserData {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private LocalDateTime creationDate;
  private LocalDateTime updateDate;
  private String createdBy;
  private String updatedBy;

  private String name;
  private String surname;
  private String email;
  private String password;

  @PrePersist
  protected void onBaseCreate() {
    setCreatedBy("SYSTEM");
    setCreationDate(LocalDateTime.now());
    setUpdatedBy("SYSTEM");
    setUpdateDate(LocalDateTime.now());
  }

  @PreUpdate
  protected void onBaseUpdate() {
    setUpdatedBy("SYSTEM");
    setUpdateDate(LocalDateTime.now());
  }

}
