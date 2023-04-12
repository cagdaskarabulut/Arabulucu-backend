package com.karabulut.arabulucubackend.Common.exception;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BaseException extends RuntimeException {

    private Code code;

    public BaseException(Code code) {
        this.code = code;
    }

    public BaseException(String message, Code code) {
        super(message);
        this.code = code;
    }

    public BaseException(String message, Code code, Throwable ex) {
        super(message, ex);
        this.code = code;
    }
}
