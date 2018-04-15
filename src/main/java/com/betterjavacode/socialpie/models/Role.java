package com.betterjavacode.socialpie.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "Role")
@Table(name = "role")
@Data
public class Role implements Serializable
{
    private static final long serialVersionUID = 1L;

    public Role()
    {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "rolename", nullable = false)
    private String roleName;
}
