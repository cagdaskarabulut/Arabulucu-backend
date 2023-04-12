package com.karabulut.arabulucubackend.Job.enums;

import com.karabulut.arabulucubackend.Common.exception.Code;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.aspectj.weaver.ast.Not;

@Getter
@RequiredArgsConstructor
public enum JobStatus implements Code {

    notStarted(1, "jobStatus.notStarted"),
    started(2, "jobStatus.started"),
    waiting(2, "jobStatus.waiting"),
    completed(2, "jobStatus.completed");

    private final Integer code;
    private final String messageKey;
}
