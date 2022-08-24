package com.aenesgur.crudappwithauth.model.entity.user;


import com.aenesgur.crudappwithauth.model.entity.user.enums.Role;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "APP_USER")
@Getter
@Setter
public class UserContext {
    @Id
    @SequenceGenerator(name = "seq_app_user", allocationSize = 1)
    @GeneratedValue(generator = "seq_app_user", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(length = 15, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(unique = true, nullable = false)
    private  String email;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;
}
