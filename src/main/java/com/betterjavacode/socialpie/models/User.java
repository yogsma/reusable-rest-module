package com.betterjavacode.socialpie.models;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity(name = "User")
@Table(name = "user")
@Data
public class User implements Serializable
{
    private static final long serialVersionUID = 1L;

    public User()
    {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "guid", nullable = false, columnDefinition = "uniqueIdentifier")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String guid;

    @Column(name = "firstname", nullable = false)
    private String firstName;

    @Column(name = "middlename")
    private String middleName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "email", nullable = false)
    private String email;

    @JoinColumn
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private Company company;

    @JoinColumn
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private List<Role> roles;

}
