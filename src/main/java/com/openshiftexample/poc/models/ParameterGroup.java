package com.openshiftexample.poc.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Data
@Table(name = "TPRMGRP")
public class ParameterGroup {

    @Id
    @NotNull
    @Column(name = "prm_grp_cd")
    private int parameterGroupCode;

    @Column(name = "prm_grp_na", length = 50)
    private String parameterGroupName;

    @Column(name = "lde_ir", length = 1)
    private int recordDeleteIndicator;

    @Column(name = "rec_crt_ts")
    private Date recordCreateTimestamp;

    @Column(name = "rec_crt_usr_nr", length = 11)
    private String recordCreateUserNumber;

    @Column(name = "rec_udt_usr_nr", length = 11)
    private String recordUpdateUserNumber;

    @Column(name = "rec_udt_ts")
    private Date recordUpdateTimestamp;
}