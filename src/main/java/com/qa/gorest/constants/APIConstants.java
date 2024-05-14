package com.qa.gorest.constants;

public class APIConstants {


    private static final String GO_REST_ENDPOINT="/public/v2/users/";
    private static final String CIRCUIT_ENDPOINT="/api/f1";
    private static final String AMADEUS_TOKEN_ENDPOINT="/v1/security/oauth2/token";
    private static final String AMADEUS_FLIGHTBOOKING_ENDPOINT="/v1/shopping/flight-destinations";

    public static String getGoRestEndpoint(){
        return GO_REST_ENDPOINT;
    }
    public static String getCircuitEndpoint(){
        return CIRCUIT_ENDPOINT;
    }
    public static String getAmadeusTokenEndpoint(){
        return AMADEUS_TOKEN_ENDPOINT;
    }
    public static String getAmadeusFlightbookingEndpoint(){
        return AMADEUS_FLIGHTBOOKING_ENDPOINT;
    }


}
