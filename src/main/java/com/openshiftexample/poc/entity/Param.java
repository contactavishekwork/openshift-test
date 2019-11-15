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
@Table(name = "TPRM")
public class Param {

    @Column(name = "PRM_SYS_NR")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int prmSysNum;

    @Column(name = "PRM_TYP_NUM")
    private int prmTypNum;

    @Column(name = "PRM_NA", length = 100)
    private String prmNa;

    @Column(name = "PRM_VLU_TE", length = 4000)
    private String prmVluTe;

    @Column(name = "REC_EFF_STT_TS", columnDefinition = "Timestamp")
    //TODO add info for time stamp.
    private String recEffSttTs;

    @Column(name = "PRM_DSC_TE", length = 200)
    private String prmDscTe;

    @Column(name = "PRM_GRP_NUM")
    private int prmGrpNum;

    @Column(name = "REC_DEL_IND")
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
