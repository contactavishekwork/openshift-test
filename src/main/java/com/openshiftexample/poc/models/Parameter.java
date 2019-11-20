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


/**
 * This class contains the Parameters.
 * The class persists the table: TPRM
 *
 * @author Avishek Datta
 * Date: 13th November, 2019
 */
@Entity
@Data
@Table(name = "TPRM")
public class Parameter {

    @Id
    @NotNull
    @Column(name = "prm_sys_nr")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long parameterSystemNumber;

    @Column(name = "prm_typ_cd", length = 3)
    private int parameterTypeNumber;

    @Column(name = "prm_na", length = 100)
    private String parameterName;

    @Column(name = "prm_vlu_te", length = 4000)
    private String parameterValue;

    @Column(name = "prm_dsc_te", length = 200)
    private String parameterDescription;

    @Column(name = "prm_grp_cd")
    private int parameterGroupNumber;

    @Column(name = "lde_ir", length = 1)
    private char recordDeleteIndicator;

    @Column(name = "rec_eff_stt_ts")
    private Date recordEffectiveStartTimeStamp;

    @Column(name = "rec_crt_ts")
    private Date recordCreatedTimeStamp;

    @Column(name = "rec_crt_usr_nr", length = 11)
    private String recordCreatedUserNumber;

    @Column(name = "rec_udt_usr_na", length = 50)
    private String recordUpdateUserName;

    @Column(name = "rec_udt_usr_nr", length = 11)
    private String recordUpdateUserNumber;

    @Column(name = "rec_udt_ts")
    private Date recordUpdateTimestamp;
}
