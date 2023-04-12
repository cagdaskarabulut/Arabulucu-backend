package com.karabulut.arabulucubackend.Common.exception;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ResponseCode implements Code {

    SUCCESS(0, "success"),
    INTERNAL_ERROR(1, "error.code.internal_error"),
    VALIDATION_ERROR(2, "error.code.validation_error"),
    ACCESS_DENIED(3, "error.code.access_denied"),
    OPTIMISTIC_LOCKING_FAILED(1, "error.code.optimistic_locking");
    private final Integer code;
    private final String messageKey;

    ResponseCode(Integer code, String messageKey) {
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

    public static String getMessageKey(Throwable throwable) {
        if (throwable.getMessage().contains("optimistic locking failed")) {
            return OPTIMISTIC_LOCKING_FAILED.getMessageKey();
        }
        return ResponseCode.INTERNAL_ERROR.getMessageKey();
    }
}
