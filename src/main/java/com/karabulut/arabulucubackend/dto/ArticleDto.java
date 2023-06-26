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
public class ArticleDto extends ModelCore {
    private String topic;
    private String content;
    private UserData user;
}
