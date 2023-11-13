package com.tms.spring.boot.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Entity

@Data
@NoArgsConstructor
@AllArgsConstructor

@Builder

@Table(name = "persons")
public class PersonEntity implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String personName;
    private String password;
    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<PermissionEntity> permissions;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return getPermissions()
                .stream()
                .map(permissionEntity -> new SimpleGrantedAuthority(permissionEntity.getName()))
                .collect(Collectors.toList());
    }

    @Override
    public String getUsername() {
        return personName;
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
