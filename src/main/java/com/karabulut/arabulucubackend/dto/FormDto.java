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
public class FormDto extends ModelCore {
    private String subject;
    private String definition;
    private UserData user;
}