package com.betterjavacode.socialpie.models;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "Session")
@Table(name = "session")
@Data
public class Session implements Serializable
{
    private static final long serialVersionUID = 1L;

    public Session()
    {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "guid", nullable = false, columnDefinition = "uniqueIdentifier", length = 255)
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String guid;

    @JoinColumn
    @OneToOne
    private User user;

    @Column(name = "useragent")
    private String useragent;

    @Column(name = "createtime")
    private Date createtime;

    @Column(name = "accesstime")
    private Date accesstime;

    @Column(name = "timeout")
    private int timeout;

}
