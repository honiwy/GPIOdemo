package com.avc.app.gpiodemo

import android.app.Application
import android.content.Context

class GpioDemoApplication : Application() {


    companion object {
        lateinit var appContext: Context
    }

    override fun onCreate() {
        super.onCreate()
        appContext = applicationContext
    }
}