package com.karabulut.arabulucubackend.model;

import com.karabulut.arabulucubackend.model.common.ModelCore;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Set;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "jobs")
public class Job extends ModelCore {
    private String relatedForm;
    private String relatedNotes;
    private String jobStatus;
    @ManyToOne
    private UserData user;
    @OneToMany
    private Set<Form> forms;
    @OneToMany
    private Set<Note> notes;
}
