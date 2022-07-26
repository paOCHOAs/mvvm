package com.policode.mvvm.data

import com.policode.mvvm.data.model.QuoteModel
import com.policode.mvvm.data.model.QuoteProvider
import com.policode.mvvm.data.network.QuoteService

class QuoteRepository {
    private val api = QuoteService()

    suspend fun getAllQuotes():List<QuoteModel>{
        val response = api.getQuotes()
        QuoteProvider.quotes = response
        return response
    }
}