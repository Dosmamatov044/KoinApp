package com.example.koinapp

import android.app.Application
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.core.scope.get
import org.koin.dsl.module

object ApplicationModule {

    val applicationModule:Module= module {




        single<MyRepository> {
provideMyRepository()
        }

        viewModel{
            provideAndroidMyViewModel(get(),get())
           // provideMyViewModel(get())
        }




    }


    fun provideMyRepository():MyRepository= MyRepository()


   // fun provideMyViewModel(myRepository: MyRepository)=MyViewModel()
    fun provideAndroidMyViewModel(application: Application,myRepository: MyRepository)=MyViewModel(application)



}