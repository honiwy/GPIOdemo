package com.avc.app.gpiodemo.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    // TODO: Implement the ViewModel
    private val _isDiEnabled = MutableLiveData<Boolean>()

    val isDiEnabled: LiveData<Boolean>
        get() = _isDiEnabled

    fun clickDiSwitch(){
        _isDiEnabled.value = (_isDiEnabled.value == false)
    }

    init {
        _isDiEnabled.value = false
    }
}
