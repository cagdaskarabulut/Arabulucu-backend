package com.karabulut.arabulucubackend.controller;

import com.karabulut.arabulucubackend.dto.NoteDto;
import com.karabulut.arabulucubackend.dto.common.BaseResponse;
import com.karabulut.arabulucubackend.enums.common.MessageCode;
import com.karabulut.arabulucubackend.service.NoteService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "note", description = "This endpoints contain note APIs user details.")
@RequestMapping(value = "/note")
@RequiredArgsConstructor
public class NoteController {
    private final NoteService service;

    @GetMapping("/{id}")
    public BaseResponse<NoteDto> getById(@PathVariable Long id){
        return BaseResponse.<NoteDto>builder()
                .messageCore(MessageCode.SUCCESS)
                .payload(service.getById(id))
                .build();
    }

    @GetMapping
    public BaseResponse<List<NoteDto>> getAll(){
        return BaseResponse.<List<NoteDto>>builder()
                .messageCore(MessageCode.SUCCESS)
                .payload(service.getAll())
                .build();
    }

    @PostMapping
    public BaseResponse<NoteDto> save(@RequestBody NoteDto noteDto){
        return BaseResponse.<NoteDto>builder()
                .messageCore(MessageCode.SUCCESS)
                .payload(service.save(noteDto))
                .message(MessageCode.SUCCESS.getMessageKey())
                .build();
    }

    @DeleteMapping("/{noteId}")
    public BaseResponse<Void> delete(@PathVariable Long noteId){
        service.delete(noteId);
        return BaseResponse.<Void>builder()
                .messageCore(MessageCode.SUCCESS)
                .message(MessageCode.SUCCESS.getMessageKey())
                .id(noteId)
                .build();
    }
}
