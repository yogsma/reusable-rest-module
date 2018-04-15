package com.betterjavacode.socialpie.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "UserPassword")
@Table(name = "userpassword")
@Data
public class UserPassword implements Serializable
{
    private static final long serialVersionUID = 1L;

    public UserPassword()
    {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "password", nullable = false)
    private String password;

    @JoinColumn
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private User user;
}
