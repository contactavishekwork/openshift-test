package com.openshiftexample.poc.entity;

import javax.persistence.Entity;

import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Id;

import java.util.Date;
import lombok.Data;


@Entity
@Data
@Table(name = "TPRMGRP")
public class Group {
    @Column(name = "PRM_GRP_NUM")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int prmGrpNum;

    @Column(name = "PRM_GRP_CD", length = 2)
    private String prmGrpCd;

    @Column(name = "PRM_GRP_NA", length = 50)
    private String prmGrpNa;

    @Column(name = "REC_DEL_IND", columnDefinition = "Number")
    private int recDelInd;

    @Column(name = "CREATED_DATE", columnDefinition = "DATE")
    private Date createdDate = new Date();

    @Column(name = "CREATED_BY", length = 50)
    private String createdBy;

    @Column(name = "MODIFIED_DATE", columnDefinition = "DATE")
    private Date modifiedDate = new Date();

    @Column(name = "MODIFIED_BY", length = 50)
    private String modifiedBy;

}
