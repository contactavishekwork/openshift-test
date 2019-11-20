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

    @Column(name = "prm_typ_num")
    private int parameterTypeNumber;

    @Column(name = "prm_na")
    private String parameterName;

    @Column(name = "prm_vlu_te")
    private String parameterValue;

    @Column(name = "rec_eff_stt_ts")
    private Date recordEffectiveStateTime;

    @Column(name = "prm_dsc_te")
    private String parameterDescription;

    @Column(name = "prm_grp_num")
    private int parameterGroupNumber;

    @Column(name = "rec_del_ind")
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
