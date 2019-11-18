package com.openshiftexample.poc.models;

import lombok.Data;
import org.springframework.web.servlet.tags.Param;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

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
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(
                name = "GetAllParametersByUserRole",
                procedureName = "pkg_get_set_parmas_ms.prc_get_params_by_role",
                resultClasses = {Parameter.class},
                parameters = {
                        @StoredProcedureParameter(name = "parameterGroupNumber", type = Integer.class, mode = ParameterMode.IN),
                        @StoredProcedureParameter(name = "userApplicationRelationName", type = String.class, mode = ParameterMode.IN),
                        @StoredProcedureParameter(name = "recordUserNumber", type = String.class, mode = ParameterMode.IN),
                        @StoredProcedureParameter(name = "groupParams", type = Parameter.class, mode = ParameterMode.OUT)
                }),
        @NamedStoredProcedureQuery(
                name = "GetParametersByName",
                procedureName = "GET_PARAMETER_BY_NAME",
                resultClasses = {Parameter.class},
                parameters = {
                        @StoredProcedureParameter(name = "parameterSystemName", type = String.class, mode = ParameterMode.OUT)
                }),
        @NamedStoredProcedureQuery(
                name = "CreateParameter",
                procedureName = "CREATE_PARAMETER",
                resultClasses = {Parameter.class},
                parameters = {
                        @StoredProcedureParameter(name = "parameterSystemNumber", type = Integer.class, mode = ParameterMode.IN),
                        @StoredProcedureParameter(name = "parameterTypeNumber", type = Integer.class, mode = ParameterMode.IN),
                        @StoredProcedureParameter(name = "parameterName", type = String.class, mode = ParameterMode.IN),
                        @StoredProcedureParameter(name = "parameterValue", type = String.class, mode = ParameterMode.IN),
                        @StoredProcedureParameter(name = "recordEffectiveStateTime", type = Date.class, mode = ParameterMode.IN),
                        @StoredProcedureParameter(name = "parameterDescription", type = String.class, mode = ParameterMode.IN),
                        @StoredProcedureParameter(name = "parameterGroupNumber", type = Integer.class, mode = ParameterMode.IN),
                        @StoredProcedureParameter(name = "recordDeleteIndicator", type = Integer.class, mode = ParameterMode.IN),
                        @StoredProcedureParameter(name = "createdDate", type = Date.class, mode = ParameterMode.IN),
                        @StoredProcedureParameter(name = "createdBy", type = String.class, mode = ParameterMode.IN),
                        @StoredProcedureParameter(name = "modifiedDate", type = Date.class, mode = ParameterMode.IN),
                        @StoredProcedureParameter(name = "modifiedBy", type = String.class, mode = ParameterMode.IN)
                }
        )
})
public class Parameter {

    @Id
    @NotNull
    @Column(name = "prm_sys_nr")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int parameterSystemNumber;

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
