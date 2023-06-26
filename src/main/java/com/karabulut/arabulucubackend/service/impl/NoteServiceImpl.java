package com.karabulut.arabulucubackend.service.impl;

import com.karabulut.arabulucubackend.dto.NoteDto;
import com.karabulut.arabulucubackend.mapper.NoteMapper;
import com.karabulut.arabulucubackend.model.Note;
import com.karabulut.arabulucubackend.repository.NoteRepository;
import com.karabulut.arabulucubackend.service.NoteService;
import lombok.RequiredArgsConstructor;
import lombok.var;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class NoteServiceImpl implements NoteService {
    private final NoteRepository repository;
    private final NoteMapper mapper;

    @Override
    public NoteDto save(NoteDto noteDto) {
        Note noteToSave = mapper.toNote(noteDto);
        Note savedNote = repository.save(noteToSave);
        return mapper.toNoteDto(savedNote);
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
    public NoteDto getById(Long id) {
        var found = repository.findById(id);
        return mapper.toNoteDto(found.get());
    }

    @Override
    public List<NoteDto> getAll() {
        var foundList = repository.findAll();
        return mapper.toNoteDtoList((List<Note>) foundList);
    }
}
