package com.karabulut.arabulucubackend.service;

import com.karabulut.arabulucubackend.dto.FormDto;

import java.util.List;

public interface FormService {
    FormDto save(FormDto formDto);
    boolean delete(Long id);
    FormDto getById(Long id);
    List<FormDto> getAll();
}
