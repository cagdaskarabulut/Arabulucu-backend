package com.karabulut.arabulucubackend.model;

import com.karabulut.arabulucubackend.model.common.ModelCore;
import jakarta.persistence.Entity;
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
@Table(name = "userdata")
public class UserData extends ModelCore {
    private String name;
    private String surname;
    private String email;
    private String password;
    @OneToMany
    private Set<Article> articles;
    @OneToMany
    private Set<Form> forms;
    @OneToMany
    private Set<Note> notes;
    @OneToMany
    private Set<Job> jobs;
}
