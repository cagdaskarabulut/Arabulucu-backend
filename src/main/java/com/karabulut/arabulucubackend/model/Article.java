package com.karabulut.arabulucubackend.model;

import com.karabulut.arabulucubackend.model.common.ModelCore;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "articles")
public class Article extends ModelCore {
    private String topic;
    private String content;
    @ManyToOne
    private UserData user;
}
