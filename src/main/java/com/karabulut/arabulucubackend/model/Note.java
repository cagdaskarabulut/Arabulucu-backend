package com.karabulut.arabulucubackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private LocalDateTime creationDate;

    @Column
    private String mailAddress;

    @Column
    private String phoneNumber;

    @Column
    private String note;

    @PrePersist
    protected void onBaseCreate() {
        setCreationDate(LocalDateTime.now());
    }


}
