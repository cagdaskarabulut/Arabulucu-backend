package com.karabulut.arabulucubackend.Common.model;

import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Version;
import lombok.*;
import lombok.experimental.SuperBuilder;

@MappedSuperclass
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
@ToString(callSuper = true, onlyExplicitlyIncluded = true)
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
@AllArgsConstructor
@Getter
@Setter
public class VersionedEntity extends DatedEntity {

    @Version
    private Long version;
}
