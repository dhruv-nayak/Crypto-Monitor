package com.example.gweiland;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("your api path")
    Call<CryptocurrencyResponse> getCryptoData();

    @GET("path")
    Call<ApiResponse> getlogo(@Query("id") int id);

}
