package com.karabulut.arabulucubackend.Job.model;

import com.karabulut.arabulucubackend.Common.model.VersionedEntity;
import com.karabulut.arabulucubackend.Form.model.Form;
import com.karabulut.arabulucubackend.Job.enums.JobStatus;
import com.karabulut.arabulucubackend.Note.model.Note;
import com.karabulut.arabulucubackend.User.model.User;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Where;

import java.util.List;

@Data
@Entity
@Table(name = "job")
@Where(clause = "is_deleted='0'")
public class Job extends VersionedEntity {

    private JobStatus jobStatus;

    @OneToMany
    private List<Form> relatedFormList;

    @OneToMany
    private List<Note> noteList;

    @ManyToOne
    private User user;

}
