package com.jubayir.retrofitcomments.retrofit;

import retrofit2.Retrofit;

public class ApiClient {
    private static final String BASE_URL = "https://jsonplaceholder.typicode.com/";
    private static ApiClient mInstance;
    private Retrofit retrofit;
}
