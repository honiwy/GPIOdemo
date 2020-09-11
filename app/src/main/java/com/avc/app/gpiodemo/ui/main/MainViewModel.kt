package com.avc.app.gpiodemo.ui.main

import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.avc.app.gpiodemo.GpioDemoApplication
import com.avc.app.gpiodemo.R

class MainViewModel : ViewModel() {
    // TODO: Implement the ViewModel
    private val _isDiEnabled = MutableLiveData<Boolean>()

    val isDiEnabled: LiveData<Boolean>
        get() = _isDiEnabled

    fun clickDiSwitch() {
        _isDiEnabled.value = (_isDiEnabled.value == false)
    }

    private val _isDo1Enabled = MutableLiveData<Boolean>()

    val isDo1Enabled: LiveData<Boolean>
        get() = _isDo1Enabled

    fun clickDo1Switch() {
        _isDo1Enabled.value = (_isDo1Enabled.value == false)
    }

    private val _isDo2Enabled = MutableLiveData<Boolean>()

    val isDo2Enabled: LiveData<Boolean>
        get() = _isDo2Enabled

    fun clickDo2Switch() {
        _isDo2Enabled.value = (_isDo2Enabled.value == false)
    }

    private val _do1PulseSec = MutableLiveData<Int>()

    val do1PulseSec: LiveData<Int>
        get() = _do1PulseSec

    fun changeDo1PulseTime(sec: Int) {
        _do1PulseSec.value = sec
    }

    private val _do1DelaySec = MutableLiveData<Int>()

    val do1DelaySec: LiveData<Int>
        get() = _do1DelaySec

    fun changeDo1DelayTime(sec: Int) {
        _do1DelaySec.value = sec
    }

    private val _do2PulseSec = MutableLiveData<Int>()

    val do2PulseSec: LiveData<Int>
        get() = _do2PulseSec

    fun changeDo2PulseTime(sec: Int) {
        _do2PulseSec.value = sec
    }

    private val _do2DelaySec = MutableLiveData<Int>()

    val do2DelaySec: LiveData<Int>
        get() = _do2DelaySec

    fun changeDo2DelayTime(sec: Int) {
        _do2DelaySec.value = sec
    }

    private val _seekBarDisplayValue = MutableLiveData<Int>()

    val seekBarDisplayValue: LiveData<Int>
        get() = _seekBarDisplayValue

    fun changeSeekBarDisplay(sec: Int) {
        _seekBarDisplayValue.value = sec
    }

    var do1LastTimeTriggered: Long = 0
    var do2LastTimeTriggered: Long = 0

    private val _isDO1TriggeredTooOften = MutableLiveData<Boolean>()

    val isDO1TriggeredTooOften: LiveData<Boolean>
        get() = _isDO1TriggeredTooOften

    private val _isDO2TriggeredTooOften = MutableLiveData<Boolean>()

    val isDO2TriggeredTooOften: LiveData<Boolean>
        get() = _isDO2TriggeredTooOften

    private val _isDO1NormalOpen = MutableLiveData<Boolean>()

    val isDO1NormalOpen: LiveData<Boolean>
        get() = _isDO1NormalOpen

    private val _isDO2NormalOpen = MutableLiveData<Boolean>()

    val isDO2NormalOpen: LiveData<Boolean>
        get() = _isDO2NormalOpen

    private val _isDO1LightOn = MutableLiveData<Boolean>()

    val isDO1LightOn: LiveData<Boolean>
        get() = _isDO1LightOn

    private val _isDO2LightOn = MutableLiveData<Boolean>()

    val isDO2LightOn: LiveData<Boolean>
        get() = _isDO2LightOn

    init {
        _isDiEnabled.value = false
        _isDo1Enabled.value = false
        _isDo2Enabled.value = false
        _do1PulseSec.value = 1
        _do1DelaySec.value = 1
        _do2PulseSec.value = 1
        _do2DelaySec.value = 1
        _isDO1TriggeredTooOften.value = false
        _isDO2TriggeredTooOften.value = false
    }

    fun triggerEvent() {
        Toast.makeText(GpioDemoApplication.appContext, R.string.trigger_toast, Toast.LENGTH_SHORT).show()
        if (_isDo1Enabled.value == true && isTimeToTriggerDO1()) {
            //todo: trigger do1 than close
        }

        if (_isDo2Enabled.value == true && isTimeToTriggerDO2()) {
            //todo: trigger do2 than close
        }
    }

    private fun isTimeToTriggerDO1(): Boolean {
        return if ((System.currentTimeMillis() - do1LastTimeTriggered) > (_do1PulseSec.value!! + _do1DelaySec.value!!) * 1000) {
            do1LastTimeTriggered = System.currentTimeMillis()
            _isDO1TriggeredTooOften.value = false
            true
        } else {
            _isDO1TriggeredTooOften.value = true
            false
        }
    }

    private fun isTimeToTriggerDO2(): Boolean {
        return if ((System.currentTimeMillis() - do2LastTimeTriggered) > (_do2PulseSec.value!! + _do2DelaySec.value!!) * 1000) {
            do2LastTimeTriggered = System.currentTimeMillis()
            _isDO2TriggeredTooOften.value = false
            true
        } else {
            _isDO2TriggeredTooOften.value = true
            false
        }
    }
}
