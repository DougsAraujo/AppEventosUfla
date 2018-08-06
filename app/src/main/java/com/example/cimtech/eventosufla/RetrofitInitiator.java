package com.example.cimtech.eventosufla;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by cimtech on 10/08/17.
 */

public class RetrofitInitiator {

    private static final String Endereco = "https://eventos-ws.herokuapp.com";

    public Retrofit getInitiator() {


        Retrofit retrofit = new Retrofit.Builder().baseUrl(Endereco)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit;
    }
}
