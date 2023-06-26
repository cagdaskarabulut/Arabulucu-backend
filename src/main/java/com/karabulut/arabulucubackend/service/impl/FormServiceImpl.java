package com.karabulut.arabulucubackend.service.impl;

import com.karabulut.arabulucubackend.dto.FormDto;
import com.karabulut.arabulucubackend.mapper.FormMapper;
import com.karabulut.arabulucubackend.model.Form;
import com.karabulut.arabulucubackend.repository.FormRepository;
import com.karabulut.arabulucubackend.service.FormService;
import lombok.RequiredArgsConstructor;
import lombok.var;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class FormServiceImpl implements FormService {
    private final FormRepository repository;
    private final FormMapper mapper;

    @Override
    public FormDto save(FormDto formDto) {
        Form formToSave = mapper.toForm(formDto);
        Form savedForm = repository.save(formToSave);
        return mapper.toFormDto(savedForm);
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
    public FormDto getById(Long id) {
        var found = repository.findById(id);
        return mapper.toFormDto(found.get());
    }

    @Override
    public List<FormDto> getAll() {
        var foundList = repository.findAll();
        return mapper.toFormDtoList((List<Form>) foundList);
    }
}
