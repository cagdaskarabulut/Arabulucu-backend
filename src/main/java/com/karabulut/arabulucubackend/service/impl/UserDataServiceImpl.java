package com.karabulut.arabulucubackend.service.impl;

import com.karabulut.arabulucubackend.dto.UserDataDto;
import com.karabulut.arabulucubackend.mapper.UserDataMapper;
import com.karabulut.arabulucubackend.model.UserData;
import com.karabulut.arabulucubackend.repository.UserDataRepository;
import com.karabulut.arabulucubackend.service.UserDataService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.var;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserDataServiceImpl implements UserDataService {
    private final UserDataRepository repository;
    private final UserDataMapper mapper;

    @Override
    public UserDataDto save(UserDataDto userDataDto) {
        UserData userDataToSave = mapper.toUserData(userDataDto);
        UserData savedUserData = repository.save(userDataToSave);
        return mapper.toUserDataDto(savedUserData);
    }

    @Override
    public boolean delete(Long id) {
        try {
            repository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public UserDataDto getById(Long id) {
        var found = repository.findById(id);
        return mapper.toUserDataDto(found.get());
    }

    @Override
    public List<UserDataDto> getAll() {
        var foundList = repository.findAll();
        return mapper.toUserDataDtoList((List<UserData>) foundList);
    }

}
