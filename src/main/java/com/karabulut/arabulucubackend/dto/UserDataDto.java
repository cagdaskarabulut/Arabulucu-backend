package com.karabulut.arabulucubackend.dto;

import com.karabulut.arabulucubackend.model.common.ModelCore;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class UserDataDto extends ModelCore {
    private String name;
    private String surname;
    private String email;
    private String password;
}
