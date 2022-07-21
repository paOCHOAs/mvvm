package com.policode.mvvm.data.network

import okhttp3.Response
import retrofit2.http.GET

interface QuoteApiClient {
    @GET(".json")
    suspend fun  getAllQuotes():Response
}