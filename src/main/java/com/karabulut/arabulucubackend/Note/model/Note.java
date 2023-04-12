package com.karabulut.arabulucubackend.Note.model;

import com.karabulut.arabulucubackend.Common.model.Attachment;
import com.karabulut.arabulucubackend.Common.model.VersionedEntity;
import com.karabulut.arabulucubackend.Note.enums.NoteType;
import com.karabulut.arabulucubackend.User.model.User;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Where;

@Data
@Entity
@Table(name = "note")
@Where(clause = "is_deleted='0'")
public class Note extends VersionedEntity {
    private NoteType noteType;
    private String definition;
    @OneToOne(mappedBy = "note", cascade = CascadeType.REMOVE)
    private Attachment attachment;
    @ManyToOne
    private User user;
}
