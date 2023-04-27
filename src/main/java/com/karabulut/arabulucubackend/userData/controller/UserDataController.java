package com.karabulut.arabulucubackend.userData.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.karabulut.arabulucubackend.common.dto.BaseResponse;
import com.karabulut.arabulucubackend.userData.enums.FriendlyMessageCodes;
import com.karabulut.arabulucubackend.userData.enums.Language;
import com.karabulut.arabulucubackend.userData.response.FriendlyMessage;
import com.karabulut.arabulucubackend.userData.utils.FriendlyMessageUtils;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("user")
@RequiredArgsConstructor
@Tag(name = "userData", description = "This endpoints contain userData APIs user details.")
public class UserDataController {

    @GetMapping("/{id}")
    public BaseResponse<String> getById(@Valid @PathVariable String id) {
        var language = Language.EN;
        // FriendlyMessage message = FriendlyMessage.builder()
        // .title(FriendlyMessageUtils.getFriendlyMessage(language,
        // FriendlyMessageCodes.SUCCESS))
        // .description(FriendlyMessageUtils.getFriendlyMessage(language,
        // FriendlyMessageCodes.PRODUCT_SUCCESSFULLY_CREATED))
        // .build();

        var testJsonData = "{\"name\": \"John\", \"age\": 31, \"city\": \"New York\"}";
        return BaseResponse.<String>builder()
                .code(FriendlyMessageCodes.SUCCESS)
                .message(FriendlyMessageUtils.getFriendlyMessage(language,
                        FriendlyMessageCodes.PRODUCT_SUCCESSFULLY_CREATED))
                .payload(testJsonData)
                .build();

        // return "id:" + id + " Messages - title:" + message.getTitle() +
        // "description:" + message.getDescription();
    }

}
