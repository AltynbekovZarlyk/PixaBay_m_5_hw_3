package com.example.pixabay_m_5_hw_3

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PixaApi {

    @GET("/api/")
    fun getImage(
        @Query("q") keyWord: String,
        @Query("page") page: Int = 1,
        @Query("per_page") perPage: Int = 3,
        @Query("key") key: String = "34857620-12ee6f06eeecfc9e12b546e6b"
    ): Call<PixaModel>
}