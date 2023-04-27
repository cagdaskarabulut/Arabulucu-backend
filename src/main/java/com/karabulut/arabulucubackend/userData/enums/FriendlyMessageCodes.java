package com.karabulut.arabulucubackend.userData.enums;

import com.karabulut.arabulucubackend.common.dto.Code;

public enum FriendlyMessageCodes implements Code {
    OK(1000,"OK"),
    ERROR(1001,"ERROR"),
    SUCCESS(1002,"SUCCESS"),

    PRODUCT_NOT_CREATED_EXCEPTION(1500,"PRODUCT_NOT_CREATED_EXCEPTION"),
    PRODUCT_SUCCESSFULLY_CREATED(1501,"PRODUCT_SUCCESSFULLY_CREATED"),
    PRODUCT_NOT_FOUND_EXCEPTION(1502,"PRODUCT_NOT_FOUND_EXCEPTION"),
    PRODUCT_SUCCESSFULLY_UPDATED(1503,"PRODUCT_SUCCESSFULLY_UPDATED");
    
    private final int code;
    private final String value;

    FriendlyMessageCodes(int code,String value) {
        this.code = code;
        this.value = value;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getMessageKey() {
        return value;
    }
    
}
