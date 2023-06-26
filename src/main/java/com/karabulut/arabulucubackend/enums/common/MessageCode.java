package com.karabulut.arabulucubackend.enums.common;

import com.fasterxml.jackson.annotation.JsonValue;
import com.karabulut.arabulucubackend.dto.common.MessageCore;

public enum MessageCode implements MessageCore {
    SUCCESS(0, "success"),
    OK(1,"OK"),
    INTERNAL_ERROR(2, "ERROR"),
    VALIDATION_ERROR(3, "error.code.validation_error"),
    ACCESS_DENIED(4, "error.code.access_denied"),
    OPTIMISTIC_LOCKING_FAILED(5, "error.code.optimistic_locking"),
    USERDATA_NOT_CREATED_EXCEPTION(1500,"USERDATA_NOT_CREATED_EXCEPTION"),
    USERDATA_SUCCESSFULLY_CREATED(1501,"USERDATA_SUCCESSFULLY_CREATED"),
    USERDATA_NOT_FOUND_EXCEPTION(1502,"USERDATA_NOT_FOUND_EXCEPTION"),
    USERDATA_SUCCESSFULLY_UPDATED(1503,"USERDATA_SUCCESSFULLY_UPDATED");


    private final Integer code;
    private final String messageKey;

    MessageCode(Integer code, String messageKey) {
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
        return MessageCode.INTERNAL_ERROR.getMessageKey();
    }
}
