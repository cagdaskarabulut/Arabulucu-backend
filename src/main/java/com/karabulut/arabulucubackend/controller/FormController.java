package com.karabulut.arabulucubackend.controller;

import com.karabulut.arabulucubackend.dto.FormDto;
import com.karabulut.arabulucubackend.dto.common.BaseResponse;
import com.karabulut.arabulucubackend.enums.common.MessageCode;
import com.karabulut.arabulucubackend.service.FormService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "form", description = "This endpoints contain form APIs user details.")
@RequestMapping(value = "/form")
@RequiredArgsConstructor
public class FormController {
    private final FormService service;

    @GetMapping("/{id}")
    public BaseResponse<FormDto> getById(@PathVariable Long id){
        return BaseResponse.<FormDto>builder()
                .messageCore(MessageCode.SUCCESS)
                .payload(service.getById(id))
                .build();
    }

    @GetMapping
    public BaseResponse<List<FormDto>> getAll(){
        return BaseResponse.<List<FormDto>>builder()
                .messageCore(MessageCode.SUCCESS)
                .payload(service.getAll())
                .build();
    }

    @PostMapping
    public BaseResponse<FormDto> save(@RequestBody FormDto formDto){
        return BaseResponse.<FormDto>builder()
                .messageCore(MessageCode.SUCCESS)
                .payload(service.save(formDto))
                .message(MessageCode.SUCCESS.getMessageKey())
                .build();
    }

    @DeleteMapping("/{formId}")
    public BaseResponse<Void> delete(@PathVariable Long formId){
        service.delete(formId);
        return BaseResponse.<Void>builder()
                .messageCore(MessageCode.SUCCESS)
                .message(MessageCode.SUCCESS.getMessageKey())
                .id(formId)
                .build();
    }

}
