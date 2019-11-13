package com.openshiftexample.poc.entity;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.Date;
import lombok.Data;

@Entity
@Data
@Table(name = "CUSTOMER")
public class UserEntity {
    @Column(name = "ID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name", length = 255)
    private String name;

    @Column(name = "email", length = 255)
    private String email;

    @Column(name = "created_date")
    @Temporal(TemporalType.DATE)
    private Date date;
}
