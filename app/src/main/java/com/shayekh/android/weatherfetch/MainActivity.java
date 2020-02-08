package com.shayekh.android.weatherfetch;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private TextView text1,text2;
    private Api_Service service;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        service = Api_Response.getUser().create(Api_Service.class);
        recyclerView = (RecyclerView) findViewById(R.id.postListRecycle);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        getData();
        //Call<WeatherResponse> paku = service.getWather();


       // Call<Iota>paku=service.getWather();

//        paku.enqueue(new Callback<Iota>() {
//            @Override
//            public void onResponse(Call<Iota> call, Response<Iota> response) {
//
//
//                if (response.code() == 200) {
//                    Iota weatherResponse = response.body();
////                    textView.setText(userResponse.getInfo().getSeed()+"\n"
////                            +"\n"+ userResponse.getInfo().getVersion()
////                    + "\n"+userResponse.getInfo().getPage());
////                   text1.setText(weatherResponse.getMain().getTemp().toString()+"\n"
////                   + weatherResponse.getName());
////                    text2.setText(weatherResponse.getWeather().get(0).getDescription()
////                            );
//                    text1.setText(weatherResponse.getGroupA());
//
//
//
//                }
//
//            }
//
//            @Override
//            public void onFailure(Call<WeatherResponse> call, Throwable t) {
//
//            }
//        });
//
//        paku.enqueue(new Callback<Iota>() {
//            @Override
//            public void onResponse(Call<Iota> call, Response<Iota> response) {
//
//
//                if (response.code() == 200) {
//                   Iota weatherResponse = response.body();
//////                    textView.setText(userResponse.getInfo().getSeed()+"\n"
//////                            +"\n"+ userResponse.getInfo().getVersion()
//////                    + "\n"+userResponse.getInfo().getPage());
//////                   text1.setText(weatherResponse.getMain().getTemp().toString()+"\n"
//////                   + weatherResponse.getName());
//////                    text2.setText(weatherResponse.getWeather().get(0).getDescription()
//////                            );
//                   text1.setText(weatherResponse.getGroupA());
//                   text2.setText(weatherResponse.getGroupD());
//                }
//            }
//
//            @Override
//            public void onFailure(Call<Iota> call, Throwable t) {
//
//            }
//        });

//
//        Call<WeatherResponse> paku = service.getWather();
//        paku.enqueue(new Callback<WeatherResponse>() {
//            @Override
//            public void onResponse(Call<WeatherResponse> call, Response<WeatherResponse> response) {
//
//                if (response.code() == 200) {
//                    WeatherResponse weatherResponse = response.body();
//                    text1.setText(weatherResponse.getName());
//
//                }
//            }
//
//            @Override
//            public void onFailure(Call<WeatherResponse> call, Throwable t) {
//
//            }
//        });
   }

    private void getData() {

        Call<PostList> paku = service.getWather();
        paku.enqueue(new Callback<PostList>() {
            @Override
            public void onResponse(Call<PostList> call, Response<PostList> response) {

                PostList list=response.body();
                Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();

                PostAdapter adapter = new PostAdapter(MainActivity.this, list.getItems());
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<PostList> call, Throwable t) {

            }
        });


    }

}
