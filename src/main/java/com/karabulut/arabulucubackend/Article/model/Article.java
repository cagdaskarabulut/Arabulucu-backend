package com.karabulut.arabulucubackend.Article.model;

import com.karabulut.arabulucubackend.Common.model.VersionedEntity;
import com.karabulut.arabulucubackend.User.model.User;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.Where;

@Data
@Entity
@Table(name = "article")
@Where(clause = "is_deleted='0'")
public class Article extends VersionedEntity {
    private String topic;
    private String content;
    @ManyToOne
    private User user;
}
