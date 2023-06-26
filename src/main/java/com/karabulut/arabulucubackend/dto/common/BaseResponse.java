package com.karabulut.arabulucubackend.dto.common;

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
    protected MessageCore messageCore;
    protected T payload;
    private Long id;
}
