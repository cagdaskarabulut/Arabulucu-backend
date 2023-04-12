package com.karabulut.arabulucubackend.Common.model;

import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@MappedSuperclass
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
@ToString(callSuper = true, onlyExplicitlyIncluded = true)
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
@AllArgsConstructor
@Getter
@Setter
public class DatedEntity extends BaseEntity {

    protected LocalDateTime createdAt;

    protected LocalDateTime updatedAt;

    protected String createdBy;

    protected String updatedBy;

    private static final String SYSTEM = "system";

    @PrePersist
    protected void onBaseCreate() {
        setCreatedAt(LocalDateTime.now());
        setUpdatedAt(LocalDateTime.now());
//        setCreatedBy(SecurityUtils.getCurrentUsername().orElse(SYSTEM));
//        setUpdatedBy(SecurityUtils.getCurrentUsername().orElse(SYSTEM));
    }

    @PreUpdate
    protected void onBaseUpdate() {
        setUpdatedAt(LocalDateTime.now());
//        setUpdatedBy(SecurityUtils.getCurrentUsername().orElse(SYSTEM));
    }
}
