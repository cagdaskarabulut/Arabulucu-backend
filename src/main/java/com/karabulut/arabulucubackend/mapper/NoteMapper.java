package com.karabulut.arabulucubackend.mapper;

import com.karabulut.arabulucubackend.dto.NoteDto;
import com.karabulut.arabulucubackend.model.Note;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface NoteMapper {
    Note toNote(NoteDto noteDto);
    NoteDto toNoteDto(Note note);
    List<NoteDto> toNoteDtoList(List<Note> note);
}
