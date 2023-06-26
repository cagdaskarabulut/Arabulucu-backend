package com.karabulut.arabulucubackend.service;

import com.karabulut.arabulucubackend.dto.NoteDto;

import java.util.List;

public interface NoteService {
    NoteDto save(NoteDto noteDto);
    boolean delete(Long id);
    NoteDto getById(Long id);
    List<NoteDto> getAll();

}
