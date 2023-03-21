package com.example.koinapp

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class MyViewModel(application: Application):AndroidViewModel(application),KoinComponent {



    private val repository:MyRepository by inject()








fun getData():String{

    return repository.getData()
}






}