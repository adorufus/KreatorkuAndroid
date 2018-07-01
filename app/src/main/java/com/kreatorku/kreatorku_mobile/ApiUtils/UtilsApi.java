package com.kreatorku.kreatorku_mobile.ApiUtils;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import retrofit2.Retrofit;

/**
 * Created by Redacted-PC on 01/07/2018.
 */

public class UtilsApi {
    public static final String BASE_API_URL = "https://api.kreatorku.com/v1/";

    public static BaseApiService getAPIService() throws KeyManagementException, NoSuchAlgorithmException {
        return KreatorkuApiClient.getClient(BASE_API_URL).create(BaseApiService.class);
    }
}
