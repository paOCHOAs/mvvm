package com.policode.mvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.policode.mvvm.model.QuoteModel
import com.policode.mvvm.model.QuoteProvider

class QuoteViewModel :ViewModel(){

    val quoteModel = MutableLiveData<QuoteModel>()

    fun randomQuote(){
        val currentQuote : QuoteModel = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }
}