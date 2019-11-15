package com.openshiftexample.poc.models.response;

import com.openshiftexample.poc.models.Parameter;
import lombok.Data;

import java.util.ArrayList;

@Data
public class ParameterResponse {

    ArrayList<Parameter> parameterList;
}
