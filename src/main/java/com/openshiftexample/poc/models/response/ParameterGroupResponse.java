package com.openshiftexample.poc.models.response;

import com.openshiftexample.poc.models.ParameterGroup;
import lombok.Data;

import java.util.ArrayList;

@Data
public class ParameterGroupResponse {

    ArrayList<ParameterGroup> parameterGroupList;
}
