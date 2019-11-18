package com.openshiftexample.poc.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Data
@Table(name = "TPRMGRP")
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(
                name = "GetParameterGroupsByRole",
                procedureName = "PRC_GET_PARAM_GROUP_BY_ROLE",
                resultClasses = {ParameterGroup.class},
                parameters = {
                        @StoredProcedureParameter(name = "recordUserNumber", type = String.class, mode = ParameterMode.IN),
                        @StoredProcedureParameter(name = "userApplicationRelationName", type = String.class, mode = ParameterMode.IN),
                        @StoredProcedureParameter(name = "parameterGroupName", type = String.class, mode = ParameterMode.OUT),
                }

        ),

         @NamedStoredProcedureQuery(
                 name = "CreateParameterGroup",
                 procedureName = "CREATE_PARAM_GROUP",
                 resultClasses = {Parameter.class},
                 parameters = {
                         @StoredProcedureParameter(name = "parameterGroupNumber", type = Integer.class, mode = ParameterMode.IN),
                         @StoredProcedureParameter(name = "parameterGroupCode", type = Integer.class, mode = ParameterMode.IN),
                         @StoredProcedureParameter(name = "parameterGroupName", type = String.class, mode = ParameterMode.IN),
                         @StoredProcedureParameter(name = "recordDeleteIndicator", type = Integer.class, mode = ParameterMode.IN),
                         @StoredProcedureParameter(name = "createdDate", type = Date.class, mode = ParameterMode.IN),
                         @StoredProcedureParameter(name = "createdBy", type = String.class, mode = ParameterMode.IN),
                         @StoredProcedureParameter(name = "modifiedDate", type = Date.class, mode = ParameterMode.IN),
                         @StoredProcedureParameter(name = "modifiedBy", type = String.class, mode = ParameterMode.IN)
                 }
         )


})
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