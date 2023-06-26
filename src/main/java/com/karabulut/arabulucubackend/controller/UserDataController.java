package com.karabulut.arabulucubackend.controller;

import com.karabulut.arabulucubackend.dto.UserDataDto;
import com.karabulut.arabulucubackend.dto.common.BaseResponse;
import com.karabulut.arabulucubackend.enums.common.Language;
import com.karabulut.arabulucubackend.enums.common.MessageCode;
import com.karabulut.arabulucubackend.service.UserDataService;
import com.karabulut.arabulucubackend.utils.common.FriendlyMessageUtils;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "userData", description = "This endpoints contain userData APIs user details.")
@RequestMapping(value = "/userData")
@RequiredArgsConstructor
public class UserDataController {
    private final UserDataService service;

    @GetMapping("/test")
    public String test() {
        return FriendlyMessageUtils.getFriendlyMessage(Language.EN,
                MessageCode.SUCCESS);
    }

    @GetMapping("/{id}")
    public BaseResponse<UserDataDto> getById(@PathVariable Long id){
        return BaseResponse.<UserDataDto>builder()
                .messageCore(MessageCode.SUCCESS)
                .payload(service.getById(id))
                .build();
    }

    @GetMapping
    public BaseResponse<List<UserDataDto>> getAll(){
        return BaseResponse.<List<UserDataDto>>builder()
                .messageCore(MessageCode.SUCCESS)
                .payload(service.getAll())
                .build();
    }

    @PostMapping
    public BaseResponse<UserDataDto> save(@RequestBody UserDataDto userDataDto){
        return BaseResponse.<UserDataDto>builder()
                .messageCore(MessageCode.SUCCESS)
                .payload(service.save(userDataDto))
                .message(MessageCode.SUCCESS.getMessageKey())
                .build();
    }

    @DeleteMapping("/{userDataId}")
    public BaseResponse<Void> delete(@PathVariable Long userDataId){
        service.delete(userDataId);
        return BaseResponse.<Void>builder()
                .messageCore(MessageCode.SUCCESS)
                .message(MessageCode.SUCCESS.getMessageKey())
                .id(userDataId)
                .build();
    }

}
