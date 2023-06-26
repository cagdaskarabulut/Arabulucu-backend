package com.karabulut.arabulucubackend.mapper;

import com.karabulut.arabulucubackend.dto.FormDto;
import com.karabulut.arabulucubackend.model.Form;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FormMapper {
    Form toForm(FormDto formDto);
    FormDto toFormDto(Form form);
    List<FormDto> toFormDtoList(List<Form> form);
}
