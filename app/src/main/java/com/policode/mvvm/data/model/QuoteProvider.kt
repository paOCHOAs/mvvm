package com.policode.mvvm.data.model

class QuoteProvider {
    companion object{

        fun random(): QuoteModel {
            val position : Int = (0..2).random()
            return quote[position]
        }

        private val quote = listOf<QuoteModel>(
            QuoteModel(quote = "Holi 1", author = "Poli 1"),
            QuoteModel(quote = "Holi 2", author = "Poli 2"),
            QuoteModel(quote = "Holi 3", author = "Poli 3")
        )
    }

}