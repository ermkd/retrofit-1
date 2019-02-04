package com.boolment.retrofitdemo_1;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("getcategory.htm")
    Call<List<CategoryBeans>> getCategory();

}
