package com.karabulut.arabulucubackend.Form.enums;

import com.karabulut.arabulucubackend.Common.exception.Code;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@RequiredArgsConstructor
@Getter
public enum FormSubject implements Code {
    bos(1, "formSubject.empty"),
    icra(2, "formSubject.icra"),
    arabuluculuk(3,"formSubject.arabuluculuk");

    private final Integer code;
    private final String messageKey;

}
