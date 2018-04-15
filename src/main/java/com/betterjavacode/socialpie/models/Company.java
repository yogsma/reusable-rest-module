package com.betterjavacode.socialpie.models;


import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @Author - Yogesh Mali
 */

@Entity(name = "Company")
@Table(name = "company")
@Data
public class Company implements Serializable
{
    private static final long serialVersionUID = 1L;

    public Company()
    {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "guid", nullable = false, columnDefinition = "uniqueIdentifier", length = 255)
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String guid;

    @Column(name = "name", nullable = false, length = 255)
    private String name;

    @Column(name = "type", nullable = false, length = 50)
    private String type;

    @JoinColumn
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private List<Address> address;

}
