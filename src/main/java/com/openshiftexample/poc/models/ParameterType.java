package com.openshiftexample.poc.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.sql.Date;

/**
 * This class contains the types for the parameters.
 *
 * This class persists the table: TPRMTYP.
 *
 * @author Avishek Datta
 * Date: 14th November, 2019
 */
@Entity
@Data
@Table(name = "TPRMTYP")
public class ParameterType {

    @Id
    @NotNull
    @Column(name = "prm_typ_cd")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String parameterTypeCode;

    @Column(name = "prm_typ_cd_dsc_te")
    private String parameterTypeCodeDescription;

    @Column(name = "lde_id")
    private int recordDeleteIndicator;

    @Column(name = "rec_crt_ts")
    private Date recordCreateTimestamp;

    @Column(name = "rec_crt_usr_nr")
    private String recordCreateUserNumber;

    @Column(name = "rec_udt_usr_nr")
    private String recordUpdateUserNumber;

    @Column(name = "rec_udt_ts")
    private Date recordUpdateTimestamp;

}
