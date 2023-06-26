package com.karabulut.arabulucubackend.dto;

import com.karabulut.arabulucubackend.model.UserData;
import com.karabulut.arabulucubackend.model.common.ModelCore;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class JobDto extends ModelCore {
    private String relatedForm;
    private String relatedNotes;
    private String jobStatus;
    private UserData user;

}