package com.karabulut.arabulucubackend.Note.enums;

import com.karabulut.arabulucubackend.Common.exception.Code;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum NoteType implements Code {
    empty(1, "noteType.empty"),
    meeting(2, "noteType.meeting"),
    common(3, "noteType.common");

    private final Integer code;
    private final String messageKey;

}
