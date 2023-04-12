package com.karabulut.arabulucubackend.Form.model;

import com.karabulut.arabulucubackend.Common.model.VersionedEntity;
import com.karabulut.arabulucubackend.Form.enums.FormSubject;
import com.karabulut.arabulucubackend.User.model.User;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Where;

@Data
@Entity
@Table(name = "form")
@Where(clause = "is_deleted='0'")
public class Form extends VersionedEntity {
    @Enumerated(EnumType.STRING)
    private FormSubject formSubject;
    private String definition;
    @ManyToOne
    private User user;
}
