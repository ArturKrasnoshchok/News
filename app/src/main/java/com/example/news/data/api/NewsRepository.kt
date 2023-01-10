package com.example.news.data.api

import androidx.room.Query
import javax.inject.Inject

class NewsRepository @Inject constructor(private val newsService: NewsService) {
    suspend fun getNews(countryCode: String, pageNumber: Int) =
        newsService.getHeadLines(countryCode = countryCode, page = pageNumber)

    suspend fun getSearchNews(query: String, pageNumber: Int) =
        newsService.getEverything(query = query, page = pageNumber)
}