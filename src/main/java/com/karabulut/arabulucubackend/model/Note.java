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
@Table(name = "notes")
public class Note extends ModelCore {
    private String noteType;
    private String definition;
    private String attachment;
    @ManyToOne
    private UserData user;
    @ManyToOne
    private Job job;
}
