package com.karabulut.arabulucubackend.Note.controller;

import com.karabulut.arabulucubackend.Note.dto.NoteDto;
import com.karabulut.arabulucubackend.Note.model.Note;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/note")
@Validated
public class NoteController {

    @PostMapping
    public String save(@RequestBody NoteDto dto) {
        return "Save this note : " + dto;
    }

    @PutMapping("/{noteId}")
    public String update(@RequestBody NoteDto dto,
                         @PathVariable Long noteId) {
        return "Update this note : " + dto;
    }

    @DeleteMapping("/{noteId}")
    public String delete(@PathVariable Long noteId) {
        return "Delete this note : " + noteId;
    }

    @GetMapping("/{noteId}")
    public String getNote(@PathVariable Long noteId) {
        return "Get this note : " + noteId;
    }

    @GetMapping("/all")
    public List<Note> getAllNotes() {
//        return noteRepository.findAll();
        return null;
    }


}
