package com.openshiftexample.poc.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Data
@Table(name = "TAPLUSRLPRM")
public class UserRole {


    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userApplicationRoleNumber;

    private String recordUsername;

    private String recordUserNumber;

    private String userApplicationRelationName;

    private int parameterGroupNumber;

    private int recordDeleteIndicator;

    private Date createdDate;

    private String createdBy;

    private Date modifiedDate;

    private String modifiedBy;
}
