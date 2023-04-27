package com.karabulut.arabulucubackend.userData.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class UserDataDto {
  private int id;
  private String name;
  private String surname;
  private String email;
  private String password;
}
