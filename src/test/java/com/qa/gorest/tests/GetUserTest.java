package com.qa.gorest.tests;

import com.qa.gorest.basetest.BaseTest;
import com.qa.gorest.client.RestClient;
import com.qa.gorest.constants.APIConstants;
import com.qa.gorest.constants.APIHttpStatus;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;


public class GetUserTest extends BaseTest {

    @BeforeMethod
    public void getUserStepMethod(){
        restClient = new RestClient(prop,baseURI);
    }

    @Test
    public void getAllUsers(){
        restClient.get(APIConstants.getGoRestEndpoint(),true,true)
                        .then().log().all()
                        .assertThat()
                                .statusCode(APIHttpStatus.OK_200.getCode());
    }

    @Test
    public void getUser(){
        restClient.get(APIConstants.getGoRestEndpoint()+"5840049",true,true)
                .then().log().all()
                .assertThat()
                .statusCode(APIHttpStatus.OK_200.getCode());
    }

    @Test
    public void getUserWithQueryParams(){
        Map<String,Object> queryParams = new HashMap<>();
        queryParams.put("status","inactive");
        restClient.get(APIConstants.getGoRestEndpoint(),null,queryParams,true,true)
                .then().log().all()
                .assertThat()
                .statusCode(APIHttpStatus.OK_200.getCode());
    }
}
