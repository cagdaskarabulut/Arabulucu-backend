package com.karabulut.arabulucubackend.Common.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
public class BaseResponse<T> {

    protected final LocalDateTime time = LocalDateTime.now();

    protected String message;

    protected Code code;

    protected T payload;
}
