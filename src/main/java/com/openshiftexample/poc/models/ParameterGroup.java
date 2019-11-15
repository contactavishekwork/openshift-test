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
    @Column(name = "prm_grp_num")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int parameterGroupNumber;

    @Column(name = "prm_grp_cd")
    private String parameterGroupCode;

    @Column(name = "prm_grp_na")
    private String parameterGroupName;

    @Column(name = "rec_del_ind")
    private int recordDeleteIndicator;

    @Column(name = "created_date")
    private Date createdDate;

    /**
     * TODO: To be decided by UPS
     */
    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "modified_date")
    private Date modifiedDate;

    @Column(name = "modified_by")
    private String modifiedBy;
}