package com.boolment.retrofitdemo_1;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    public static final String BASE_URL = "http://192.168.1.3:8080/vinexenterprise/admin/";

    public static Retrofit retrofit = null;


//this method will return retofit instance
    public  static  Retrofit getApiClient(){

        if(retrofit == null)
        {
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }

        return  retrofit;
    }




}
