package com.karabulut.arabulucubackend.service;

import com.karabulut.arabulucubackend.dto.UserDataDto;
import com.karabulut.arabulucubackend.model.UserData;

import java.util.List;

public interface UserDataService {
    UserDataDto save(UserDataDto userDataDto);
    boolean delete(Long id);
    UserDataDto getById(Long id);
    List<UserDataDto> getAll();

}
