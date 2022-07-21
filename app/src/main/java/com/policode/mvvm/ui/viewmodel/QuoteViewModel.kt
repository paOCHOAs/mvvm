package com.policode.mvvm.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.policode.mvvm.data.model.QuoteModel
import com.policode.mvvm.data.model.QuoteProvider

class QuoteViewModel :ViewModel(){

    val quoteModel = MutableLiveData<QuoteModel>()

    fun randomQuote(){
        val currentQuote : QuoteModel = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }
}