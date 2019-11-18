package com.openshiftexample.poc.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Data
@Table(name = "TAPLUSRLPRM")
public class UserRole {


    @Id
    @NotNull
    @Column(name = "USR_APL_RL_NU")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userApplicationRoleNumber;

    @NotNull
    @Column(name = "REC_UDT_USR_NA", length = 50)
    private String recordUsername;

    @NotNull
    @Column(name = "REC_UDT_USR_NR", length = 11)
    private String recordUserNumber;

    @NotNull
    @Column(name = "USR_APL_RL_NA", length = 50)
    private String userApplicationRelationName;

    @NotNull
    @Column(name = "PRM_GRP_NUM")
    private int parameterGroupNumber;

    @NotNull
    @Column(name = "REC_DEL_IND")
    private int recordDeleteIndicator;

    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "modified_date")
    private Date modifiedDate;

    @Column(name = "modified_by")
    private String modifiedBy;
}
