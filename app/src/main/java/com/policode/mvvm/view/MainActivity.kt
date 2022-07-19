package com.policode.mvvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.policode.mvvm.databinding.ActivityMainBinding
import com.policode.mvvm.viewmodel.QuoteViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var  binding : ActivityMainBinding

    private val quoteViewModel : QuoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        quoteViewModel.quoteModel.observe(this, Observer { currentQuote ->
            binding.texto.text = currentQuote.author
        })

        binding.viewContainer.setOnClickListener{quoteViewModel.randomQuote()}
    }
}