package com.openshiftexample.poc.entity;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.TemporalType;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

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

    @Column(name = "created_date", columnDefinition = "DATE")
    private Date date = new Date();
    
}
