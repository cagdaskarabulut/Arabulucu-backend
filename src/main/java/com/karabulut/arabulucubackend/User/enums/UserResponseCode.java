package com.karabulut.arabulucubackend.User.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import com.karabulut.arabulucubackend.Common.exception.Code;

public enum UserResponseCode implements Code {
    USER_NOT_FOUND(1400, "error.userNotFound");

    private final Integer code;
    private final String messageKey;

    UserResponseCode(Integer code, String messageKey) {
        this.code = code;
        this.messageKey = messageKey;
    }

    @JsonValue
    public Integer getCode() {
        return code;
    }

    public String getMessageKey() {
        return messageKey;
    }
}
