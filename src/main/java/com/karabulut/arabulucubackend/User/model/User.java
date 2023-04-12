package com.karabulut.arabulucubackend.User.model;

import java.util.Collection;
import java.util.List;


import com.karabulut.arabulucubackend.Article.model.Article;
import com.karabulut.arabulucubackend.Common.auth.Token;
import com.karabulut.arabulucubackend.Common.model.VersionedEntity;
import com.karabulut.arabulucubackend.Form.model.Form;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.annotations.Where;
import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;


@Data
@Entity
@Table(name = "user")
@Where(clause = "is_deleted='0'")
public class User extends VersionedEntity implements UserDetails {

    /**
     *
     */
//    private static final long serialVersionUID = -8421768845853099274L;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long id;

    @NotNull(message="{constraint.username.NotNull.message}")
    @Size(min = 4, max=255)
    @UniqueElements
    private String email;

    @NotNull
    @Size(min = 4, max=255)
    private String username;

    @NotNull
    @Size(min = 4, max=255)
    private String name;

    @NotNull
    @Size(min = 4, max=255)
    private String surname;

    @NotNull
    @Size(min = 4, max=255)
    private String phoneNumber;

    @NotNull
    @Size(min = 8, max=255)
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).*$", message="{constrain.password.Pattern.message}")
    private String password;

    @OneToMany(mappedBy="user", cascade=CascadeType.REMOVE)
    private List<Article> articleList;

    @OneToMany(mappedBy="user", cascade=CascadeType.REMOVE)
    private List<Form> formList;

    @OneToMany(mappedBy="user", cascade=CascadeType.REMOVE)
    private List<Form> noteList;

    @OneToMany(mappedBy="user", cascade=CascadeType.REMOVE)
    private List<Form> jobList;

    @OneToMany(mappedBy="user", cascade=CascadeType.REMOVE)
    private List<Token> tokens;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return AuthorityUtils.createAuthorityList("Role_user");
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
