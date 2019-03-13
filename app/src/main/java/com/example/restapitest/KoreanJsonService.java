package com.example.restapitest;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface KoreanJsonService {

    @GET("todos")
    Call<List<Todo>> listTodos();

}
