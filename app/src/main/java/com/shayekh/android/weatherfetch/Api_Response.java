package com.shayekh.android.weatherfetch;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Api_Response {
    private static Retrofit retrofit;
  //  private static String BASE_URL = "http://api.openweathermap.org/data/2.5/";
    private static String BASE_URL = " https://www.googleapis.com/blogger/v3/blogs/3817523513002433752/posts/";
   // https://www.googleapis.com/blogger/v3/blogs/3817523513002433752/posts/

   // private static String BASE_URL = "https://iotait.tech/";
    public static Retrofit getUser() {
        retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()).build();
        return retrofit;
    }
}
