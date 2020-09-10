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

    private val _isDo1Enabled = MutableLiveData<Boolean>()

    val isDo1Enabled: LiveData<Boolean>
        get() = _isDo1Enabled

    fun clickDo1Switch(){
        _isDo1Enabled.value = (_isDo1Enabled.value == false)
    }

    private val _isDo2Enabled = MutableLiveData<Boolean>()

    val isDo2Enabled: LiveData<Boolean>
        get() = _isDo2Enabled

    fun clickDo2Switch(){
        _isDo2Enabled.value = (_isDo2Enabled.value == false)
    }

    private val _do1PulseSec = MutableLiveData<Int>()

    val do1PulseSec: LiveData<Int>
        get() = _do1PulseSec

    fun changeDo1PulseTime(sec: Int){
        _do1PulseSec.value = sec
    }

    private val _do1DelaySec = MutableLiveData<Int>()

    val do1DelaySec: LiveData<Int>
        get() = _do1DelaySec

    private val _do2PulseSec = MutableLiveData<Int>()

    val do2PulseSec: LiveData<Int>
        get() = _do2PulseSec

    private val _do2DelaySec = MutableLiveData<Int>()

    val do2DelaySec: LiveData<Int>
        get() = _do2DelaySec

    init {
        _isDiEnabled.value = false
        _isDo1Enabled.value = false
        _isDo2Enabled.value = false
        _do1PulseSec.value = 1
        _do1DelaySec.value = 1
        _do2PulseSec.value = 1
        _do2DelaySec.value = 1
    }
}
