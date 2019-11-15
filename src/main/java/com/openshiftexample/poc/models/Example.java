package com.openshiftexample.poc.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Example {

    @Id
    private String param;

}
