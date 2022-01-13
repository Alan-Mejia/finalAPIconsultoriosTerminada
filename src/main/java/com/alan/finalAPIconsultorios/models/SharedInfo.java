package com.alan.finalAPIconsultorios.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
public class SharedInfo implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name="Creationtime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationTime;

    @Column(name="Modificationtime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modificationTime;


    @Column(name="Password")
    private String password;

    @Column(name="Usermodifier")
    private String userModifier;

    @Column(name="Usercreator")
    private String userCreator;

}
