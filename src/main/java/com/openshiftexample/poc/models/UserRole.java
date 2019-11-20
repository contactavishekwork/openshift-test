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
    @Column(name = "usr_apl_rl_cd")
    private int userApplicationRoleCode;

    @NotNull
    @Column(name = "prm_grp_cd")
    private int parameterGroupCode;

    @NotNull
    @Column(name = "lde_ir", length = 1)
    private char recordDeleteIndicator;

    @NotNull
    @Column(name = "rec_crt_ts")
    private Date recordCreatedTimestamp;

    @NotNull
    @Column(name = "rec_crt_usr_nr", length = 11)
    private String recordCreateUserNumber;

    @NotNull
    @Column(name = "rec_udt_user_nr", length = 11)
    private String recordUpdateUserNumber;

    @Column(name = "rec_udt_ts")
    private Date recordUpdateTimestamp;

}
