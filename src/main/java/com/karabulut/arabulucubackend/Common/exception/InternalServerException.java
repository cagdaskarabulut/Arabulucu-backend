package com.karabulut.arabulucubackend.Common.exception;

public class InternalServerException extends BaseException{

    public InternalServerException(String message) {
        super(message, ResponseCode.INTERNAL_ERROR);
    }

    public InternalServerException(String message, Exception exception) {
        super(message, ResponseCode.INTERNAL_ERROR, exception);
    }
}
