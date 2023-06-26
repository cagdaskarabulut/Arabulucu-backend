package com.karabulut.arabulucubackend.mapper;

import com.karabulut.arabulucubackend.dto.UserDataDto;
import com.karabulut.arabulucubackend.model.UserData;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserDataMapper {
    UserData toUserData(UserDataDto userDataDto);
    UserDataDto toUserDataDto(UserData userData);
    List<UserDataDto> toUserDataDtoList(List<UserData> UserData);
}
