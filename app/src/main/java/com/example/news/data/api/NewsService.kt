package com.example.news.data.api


import com.example.news.models.NewsResponse
import com.example.news.utils.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsService {
    @GET("/v2/everything")
    suspend fun getEverything(
        @Query("q") query: String,
        @Query("page") page: Int = 1,
        @Query("apiKey") apiKey: String = API_KEY
    ):Response<NewsResponse>

    @GET("/v2/top-headlines")
    suspend fun getHeadLines(
        @Query("country") countryCode: String = "ua",
        @Query("page") page: Int = 1,
        @Query("apiKey") apiKey: String = API_KEY
    ):Response<NewsResponse>
}