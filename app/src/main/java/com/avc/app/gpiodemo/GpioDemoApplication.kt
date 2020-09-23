package com.avc.app.gpiodemo

import android.app.Application
import android.content.Context
import kotlin.properties.Delegates

class GpioDemoApplication : Application() {


    companion object {
        var instance: GpioDemoApplication by Delegates.notNull()
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}