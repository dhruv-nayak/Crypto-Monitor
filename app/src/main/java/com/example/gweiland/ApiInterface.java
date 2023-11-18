package com.example.gweiland;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("v1/cryptocurrency/listings/latest")
    Call<CryptocurrencyResponse> getCryptoData();

    @GET("v2/cryptocurrency/info")
    Call<ApiResponse> getlogo(@Query("id") int id);

}
