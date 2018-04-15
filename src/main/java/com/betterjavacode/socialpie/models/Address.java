package com.betterjavacode.socialpie.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "Address")
@Table(name = "address")
@Data
public class Address implements Serializable
{
    private static final long serialVersionUID = 1L;

    public Address()
    {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "address1", nullable = false)
    private String address1;

    @Column(name = "address2")
    private String address2;

    @Column(name = "address3")
    private String address3;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "state", nullable = false, length = 50)
    private String state;

    @Column(name = "country", nullable = false)
    private String country;

    @Column(name = "zipcode", length = 100)
    private String zipcode;

}
