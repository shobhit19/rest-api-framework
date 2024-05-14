package com.qa.gorest.basetest;

import com.qa.gorest.client.RestClient;
import com.qa.gorest.configuration.ConfigurationManager;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.Properties;

public class BaseTest {

    protected ConfigurationManager config;
    protected Properties prop;
    protected RestClient restClient;
    protected String baseURI;



    @Parameters({"baseURI"})
    @BeforeTest
    public void setUp(String baseURI){
        RestAssured.filters(new AllureRestAssured());

        config = new ConfigurationManager();
        prop = config.initProp();
        this.baseURI=baseURI;
        //restClient = new RestClient(prop,baseURI);
    }

}
