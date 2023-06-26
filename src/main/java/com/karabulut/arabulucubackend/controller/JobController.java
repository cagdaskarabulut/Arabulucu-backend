package com.karabulut.arabulucubackend.controller;

import com.karabulut.arabulucubackend.dto.JobDto;
import com.karabulut.arabulucubackend.dto.common.BaseResponse;
import com.karabulut.arabulucubackend.enums.common.MessageCode;
import com.karabulut.arabulucubackend.service.JobService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "job", description = "This endpoints contain job APIs user details.")
@RequestMapping(value = "/job")
@RequiredArgsConstructor
public class JobController {
    private final JobService service;

    @GetMapping("/{id}")
    public BaseResponse<JobDto> getById(@PathVariable Long id){
        return BaseResponse.<JobDto>builder()
                .messageCore(MessageCode.SUCCESS)
                .payload(service.getById(id))
                .build();
    }

    @GetMapping
    public BaseResponse<List<JobDto>> getAll(){
        return BaseResponse.<List<JobDto>>builder()
                .messageCore(MessageCode.SUCCESS)
                .payload(service.getAll())
                .build();
    }

    @PostMapping
    public BaseResponse<JobDto> save(@RequestBody JobDto jobDto){
        return BaseResponse.<JobDto>builder()
                .messageCore(MessageCode.SUCCESS)
                .payload(service.save(jobDto))
                .message(MessageCode.SUCCESS.getMessageKey())
                .build();
    }

    @DeleteMapping("/{jobId}")
    public BaseResponse<Void> delete(@PathVariable Long jobId){
        service.delete(jobId);
        return BaseResponse.<Void>builder()
                .messageCore(MessageCode.SUCCESS)
                .message(MessageCode.SUCCESS.getMessageKey())
                .id(jobId)
                .build();
    }
}
