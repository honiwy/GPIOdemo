package com.avc.app.gpiodemo.ui.main

import android.os.CountDownTimer
import android.os.Handler
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.avc.app.gpiodemo.GpioDemoApplication
import com.avc.app.gpiodemo.GpioSharedPref
import com.avc.app.gpiodemo.R

class MainViewModel : ViewModel() {
    private val _isDiEnabled = MutableLiveData<Boolean>()
    val isDiEnabled: LiveData<Boolean>
        get() = _isDiEnabled

    fun clickDiSwitch() {
        _isDiEnabled.value = (_isDiEnabled.value == false)
        GpioSharedPref.isDiEnabled = _isDiEnabled.value
    }

    private val _isDiNormalOpen = MutableLiveData<Boolean>()
    val isDiNormalOpen: LiveData<Boolean>
        get() = _isDiNormalOpen

    fun changeDiNormalStatus(isNormalOpen: Boolean) {
        //todo: change DI
        _isDiNormalOpen.value = isNormalOpen
        GpioSharedPref.diNormalOpen = isNormalOpen
    }


    // DO1
    private val _isDo1Enabled = MutableLiveData<Boolean>()
    val isDo1Enabled: LiveData<Boolean>
        get() = _isDo1Enabled

    fun clickDo1Switch() {
        _isDo1Enabled.value = (_isDo1Enabled.value == false)
        GpioSharedPref.isDo1Enabled = _isDo1Enabled.value
    }

    private val _isDO1NormalOpen = MutableLiveData<Boolean>()
    val isDO1NormalOpen: LiveData<Boolean>
        get() = _isDO1NormalOpen

    fun changeDO1NormalStatus(isNormalOpen: Boolean) {
        //todo: change DO1 light
        _isDO1NormalOpen.value = isNormalOpen
        _isDO1LightOn.value = isNormalOpen
        GpioSharedPref.do1NormalOpen = isNormalOpen
    }

    private val _do1PulseSec = MutableLiveData<Int>()
    val do1PulseSec: LiveData<Int>
        get() = _do1PulseSec

    fun changeDo1PulseTime(sec: Int) {
        _do1PulseSec.value = sec
        GpioSharedPref.do1PulseTime = sec
    }

    private val _do1DelaySec = MutableLiveData<Int>()
    val do1DelaySec: LiveData<Int>
        get() = _do1DelaySec

    fun changeDo1DelayTime(sec: Int) {
        _do1DelaySec.value = sec
        GpioSharedPref.do1DelayTime = sec
    }

    private val _isDO1TriggeredTooOften = MutableLiveData<Boolean>()
    val isDO1TriggeredTooOften: LiveData<Boolean>
        get() = _isDO1TriggeredTooOften

    private var do1NextActiveTime: Long = 0

    private val _isDO1LightOn = MutableLiveData<Boolean>()
    val isDO1LightOn: LiveData<Boolean>
        get() = _isDO1LightOn

    private val _countDownDO1 = MutableLiveData<Int>()
    val countDownDO1: LiveData<Int>
        get() = _countDownDO1

    private lateinit var countDownDO1Timer: CountDownTimer

    private fun startCountDownDO1Timer(timeCountInMilliSeconds: Long) {
        countDownDO1Timer =
                object : CountDownTimer(timeCountInMilliSeconds, 1000) {
                    override fun onTick(millisUntilFinished: Long) {
                        _countDownDO1.value = _countDownDO1.value?.minus(1)
                    }

                    override fun onFinish() {
                        _countDownDO1.value = 0
                    }
                }
        countDownDO1Timer.start()
    }


    //DO2
    private val _isDo2Enabled = MutableLiveData<Boolean>()
    val isDo2Enabled: LiveData<Boolean>
        get() = _isDo2Enabled

    fun clickDo2Switch() {
        _isDo2Enabled.value = (_isDo2Enabled.value == false)
        GpioSharedPref.isDo2Enabled = _isDo2Enabled.value
    }

    private val _isDO2NormalOpen = MutableLiveData<Boolean>()
    val isDO2NormalOpen: LiveData<Boolean>
        get() = _isDO2NormalOpen

    fun changeDO2NormalStatus(isNormalOpen: Boolean) {
        //todo: change DO2 light
        _isDO2NormalOpen.value = isNormalOpen
        _isDO2LightOn.value = isNormalOpen
        GpioSharedPref.do2NormalOpen = isNormalOpen
    }

    private val _do2PulseSec = MutableLiveData<Int>()
    val do2PulseSec: LiveData<Int>
        get() = _do2PulseSec

    fun changeDo2PulseTime(sec: Int) {
        _do2PulseSec.value = sec
        GpioSharedPref.do2PulseTime = sec

    }

    private val _do2DelaySec = MutableLiveData<Int>()
    val do2DelaySec: LiveData<Int>
        get() = _do2DelaySec

    fun changeDo2DelayTime(sec: Int) {
        _do2DelaySec.value = sec
        GpioSharedPref.do2DelayTime = sec
    }

    private val _isDO2TriggeredTooOften = MutableLiveData<Boolean>()
    val isDO2TriggeredTooOften: LiveData<Boolean>
        get() = _isDO2TriggeredTooOften

    private var do2NextActiveTime: Long = 0

    private val _isDO2LightOn = MutableLiveData<Boolean>()
    val isDO2LightOn: LiveData<Boolean>
        get() = _isDO2LightOn

    private val _countDownDO2 = MutableLiveData<Int>()
    val countDownDO2: LiveData<Int>
        get() = _countDownDO2

    private lateinit var countDownDO2Timer: CountDownTimer

    private fun startCountDownDO2Timer(timeCountInMilliSeconds: Long) {
        countDownDO2Timer =
                object : CountDownTimer(timeCountInMilliSeconds, 1000) {
                    override fun onTick(millisUntilFinished: Long) {
                        _countDownDO2.value = _countDownDO2.value?.minus(1)
                    }

                    override fun onFinish() {
                        _countDownDO2.value = 0
                    }
                }
        countDownDO2Timer.start()
    }


    private val _seekBarDisplayValue = MutableLiveData<Int>()
    val seekBarDisplayValue: LiveData<Int>
        get() = _seekBarDisplayValue

    fun changeSeekBarDisplay(sec: Int) {
        _seekBarDisplayValue.value = sec
    }

    init {
        _isDiEnabled.value = GpioSharedPref.isDiEnabled
        _isDiNormalOpen.value = GpioSharedPref.diNormalOpen

        _isDo1Enabled.value = GpioSharedPref.isDo1Enabled
        _isDO1NormalOpen.value = GpioSharedPref.do1NormalOpen
        _do1PulseSec.value = GpioSharedPref.do1PulseTime
        _do1DelaySec.value = GpioSharedPref.do1DelayTime
        _isDO1TriggeredTooOften.value = false
        _isDO1LightOn.value = GpioSharedPref.do1NormalOpen //Because not event is occurred in the beginning
        _countDownDO1.value = 0

        _isDo2Enabled.value = GpioSharedPref.isDo2Enabled
        _isDO2NormalOpen.value = GpioSharedPref.do2NormalOpen
        _do2PulseSec.value = GpioSharedPref.do2PulseTime
        _do2DelaySec.value = GpioSharedPref.do2DelayTime
        _isDO2TriggeredTooOften.value = false
        _isDO2LightOn.value = GpioSharedPref.do2NormalOpen //Because not event is occurred in the beginning
        _countDownDO2.value = 0
    }

    fun triggerEvent() {
        Toast.makeText(GpioDemoApplication.instance, R.string.trigger_toast, Toast.LENGTH_SHORT).show()
        if (_isDo1Enabled.value == true && isTimeToTriggerDO1()) triggerDO1()

        if (_isDo2Enabled.value == true && isTimeToTriggerDO2()) triggerDO2()
    }

    private fun isTimeToTriggerDO1(): Boolean {
        _do1PulseSec.value?.let { pulseSec ->
            _do1DelaySec.value?.let { delaySec ->
                return if (System.currentTimeMillis() > do1NextActiveTime) {
                    do1NextActiveTime = System.currentTimeMillis() + 1000 * (pulseSec + delaySec)
                    _isDO1TriggeredTooOften.value = false
                    true
                } else {
                    _isDO1TriggeredTooOften.value = true
                    false
                }
            }
        }
        return false
    }

    private fun isTimeToTriggerDO2(): Boolean {
        _do2PulseSec.value?.let { pulseSec ->
            _do2DelaySec.value?.let { delaySec ->
                return if (System.currentTimeMillis() > do2NextActiveTime) {
                    do2NextActiveTime = System.currentTimeMillis() + 1000 * (pulseSec + delaySec)
                    _isDO2TriggeredTooOften.value = false
                    true
                } else {
                    _isDO2TriggeredTooOften.value = true
                    false
                }
            }
        }
        return false
    }

    private val mGPIO1Handler = Handler()
    private val mGPIO2Handler = Handler()
    private var mGPIO1Runnable = {
        //todo: trigger real do1 than close
        _isDO1LightOn.value = (_isDO1LightOn.value == false)
    }
    private var mGPIO2Runnable = {
        //todo: trigger real do2 than close
        _isDO2LightOn.value = (_isDO2LightOn.value == false)
    }

    private fun triggerDO1() {
        mGPIO1Handler.post(mGPIO1Runnable)
        _do1PulseSec.value?.apply {
            _countDownDO1.value = this + 1 //for display value on UI
            startCountDownDO1Timer(this * 1000L)
            mGPIO1Handler.postDelayed(mGPIO1Runnable, this * 1000L)
        }
    }

    private fun triggerDO2() {
        mGPIO2Handler.post(mGPIO2Runnable)
        _do2PulseSec.value?.apply {
            _countDownDO2.value = this + 1 //for display value on UI
            startCountDownDO2Timer(this * 1000L)
            mGPIO2Handler.postDelayed(mGPIO2Runnable, this * 1000L)
        }
    }
}
