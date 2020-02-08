package com.shayekh.android.weatherfetch;


import retrofit2.Call;
import retrofit2.http.GET;

public interface Api_Service {
   // @GET("weather?lat=23.881570&lon=90.267420&units=metric&appid=2d279c313e5f34a68a30cefc9dccf139")

   // @GET("event_task")
    @GET("?key=AIzaSyA0Al6EPnpStx_LjJ0leqXvAE62ZM5_Q6I")
    Call<PostList> getWather();
}
