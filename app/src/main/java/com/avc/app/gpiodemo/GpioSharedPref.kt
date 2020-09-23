package com.avc.app.gpiodemo

import android.content.Context

object GpioSharedPref {

    private const val DIDO_DATA = "dido_data"
    private const val DI_NORMAL_OPEN = "di_normal_open"
    private const val DI_ENABLED = "di_enabled"

    private const val DO1_PULSE = "do1_pulse"
    private const val DO1_DELAY = "do1_delay"
    private const val DO1_NORMAL_OPEN = "do1_normal_open"
    private const val DO1_ENABLED = "do1_enabled"

    private const val DO2_PULSE = "do2_pulse"
    private const val DO2_DELAY = "do2_delay"
    private const val DO2_NORMAL_OPEN = "do2_normal_open"
    private const val DO2_ENABLED = "do2_enabled"

    var diNormalOpen: Boolean? = null
        get() = GpioDemoApplication.instance
                .getSharedPreferences(DIDO_DATA, Context.MODE_PRIVATE)
                .getBoolean(DI_NORMAL_OPEN, true)
        set(value) {
            field = when (value) {
                null -> {
                    GpioDemoApplication.instance
                            .getSharedPreferences(DIDO_DATA, Context.MODE_PRIVATE).edit()
                            .remove(DI_NORMAL_OPEN)
                            .apply()
                    null
                }
                else -> {
                    GpioDemoApplication.instance
                            .getSharedPreferences(DIDO_DATA, Context.MODE_PRIVATE).edit()
                            .putBoolean(DI_NORMAL_OPEN, value)
                            .apply()
                    value
                }
            }
        }

    var isDiEnabled: Boolean? = null
        get() = GpioDemoApplication.instance
                .getSharedPreferences(DIDO_DATA, Context.MODE_PRIVATE)
                .getBoolean(DI_ENABLED, false)
        set(value) {
            field = when (value) {
                null -> {
                    GpioDemoApplication.instance
                            .getSharedPreferences(DIDO_DATA, Context.MODE_PRIVATE).edit()
                            .remove(DI_ENABLED)
                            .apply()
                    null
                }
                else -> {
                    GpioDemoApplication.instance
                            .getSharedPreferences(DIDO_DATA, Context.MODE_PRIVATE).edit()
                            .putBoolean(DI_ENABLED, value)
                            .apply()
                    value
                }
            }
        }

    ///////////////////////////////////////////////////////////////

    var do1PulseTime: Int? = null
        get() = GpioDemoApplication.instance
                .getSharedPreferences(DIDO_DATA, Context.MODE_PRIVATE)
                .getInt(DO1_PULSE, 1)
        set(value) {
            field = when (value) {
                null -> {
                    GpioDemoApplication.instance
                            .getSharedPreferences(DIDO_DATA, Context.MODE_PRIVATE).edit()
                            .remove(DO1_PULSE)
                            .apply()
                    null
                }
                else -> {
                    GpioDemoApplication.instance
                            .getSharedPreferences(DIDO_DATA, Context.MODE_PRIVATE).edit()
                            .putInt(DO1_PULSE, value)
                            .apply()
                    value
                }
            }
        }

    var do1DelayTime: Int? = null
        get() = GpioDemoApplication.instance
                .getSharedPreferences(DIDO_DATA, Context.MODE_PRIVATE)
                .getInt(DO1_DELAY, 1)
        set(value) {
            field = when (value) {
                null -> {
                    GpioDemoApplication.instance
                            .getSharedPreferences(DIDO_DATA, Context.MODE_PRIVATE).edit()
                            .remove(DO1_DELAY)
                            .apply()
                    null
                }
                else -> {
                    GpioDemoApplication.instance
                            .getSharedPreferences(DIDO_DATA, Context.MODE_PRIVATE).edit()
                            .putInt(DO1_DELAY, value)
                            .apply()
                    value
                }
            }
        }

    var do1NormalOpen: Boolean? = null
        get() = GpioDemoApplication.instance
                .getSharedPreferences(DIDO_DATA, Context.MODE_PRIVATE)
                .getBoolean(DO1_NORMAL_OPEN, true)
        set(value) {
            field = when (value) {
                null -> {
                    GpioDemoApplication.instance
                            .getSharedPreferences(DIDO_DATA, Context.MODE_PRIVATE).edit()
                            .remove(DO1_NORMAL_OPEN)
                            .apply()
                    null
                }
                else -> {
                    GpioDemoApplication.instance
                            .getSharedPreferences(DIDO_DATA, Context.MODE_PRIVATE).edit()
                            .putBoolean(DO1_NORMAL_OPEN, value)
                            .apply()
                    value
                }
            }
        }

    var isDo1Enabled: Boolean? = null
        get() = GpioDemoApplication.instance
                .getSharedPreferences(DIDO_DATA, Context.MODE_PRIVATE)
                .getBoolean(DO1_ENABLED, false)
        set(value) {
            field = when (value) {
                null -> {
                    GpioDemoApplication.instance
                            .getSharedPreferences(DIDO_DATA, Context.MODE_PRIVATE).edit()
                            .remove(DO1_ENABLED)
                            .apply()
                    null
                }
                else -> {
                    GpioDemoApplication.instance
                            .getSharedPreferences(DIDO_DATA, Context.MODE_PRIVATE).edit()
                            .putBoolean(DO1_ENABLED, value)
                            .apply()
                    value
                }
            }
        }

    ///////////////////////////////////////////////////////////

    var do2PulseTime: Int? = null
        get() = GpioDemoApplication.instance
                .getSharedPreferences(DIDO_DATA, Context.MODE_PRIVATE)
                .getInt(DO2_PULSE, 1)
        set(value) {
            field = when (value) {
                null -> {
                    GpioDemoApplication.instance
                            .getSharedPreferences(DIDO_DATA, Context.MODE_PRIVATE).edit()
                            .remove(DO2_PULSE)
                            .apply()
                    null
                }
                else -> {
                    GpioDemoApplication.instance
                            .getSharedPreferences(DIDO_DATA, Context.MODE_PRIVATE).edit()
                            .putInt(DO2_PULSE, value)
                            .apply()
                    value
                }
            }
        }

    var do2DelayTime: Int? = null
        get() = GpioDemoApplication.instance
                .getSharedPreferences(DIDO_DATA, Context.MODE_PRIVATE)
                .getInt(DO2_DELAY, 1)
        set(value) {
            field = when (value) {
                null -> {
                    GpioDemoApplication.instance
                            .getSharedPreferences(DIDO_DATA, Context.MODE_PRIVATE).edit()
                            .remove(DO2_DELAY)
                            .apply()
                    null
                }
                else -> {
                    GpioDemoApplication.instance
                            .getSharedPreferences(DIDO_DATA, Context.MODE_PRIVATE).edit()
                            .putInt(DO2_DELAY, value)
                            .apply()
                    value
                }
            }
        }

    var do2NormalOpen: Boolean? = null
        get() = GpioDemoApplication.instance
                .getSharedPreferences(DIDO_DATA, Context.MODE_PRIVATE)
                .getBoolean(DO2_NORMAL_OPEN, true)
        set(value) {
            field = when (value) {
                null -> {
                    GpioDemoApplication.instance
                            .getSharedPreferences(DIDO_DATA, Context.MODE_PRIVATE).edit()
                            .remove(DO2_NORMAL_OPEN)
                            .apply()
                    null
                }
                else -> {
                    GpioDemoApplication.instance
                            .getSharedPreferences(DIDO_DATA, Context.MODE_PRIVATE).edit()
                            .putBoolean(DO2_NORMAL_OPEN, value)
                            .apply()
                    value
                }
            }
        }

    var isDo2Enabled: Boolean? = null
        get() = GpioDemoApplication.instance
                .getSharedPreferences(DIDO_DATA, Context.MODE_PRIVATE)
                .getBoolean(DO2_ENABLED, false)
        set(value) {
            field = when (value) {
                null -> {
                    GpioDemoApplication.instance
                            .getSharedPreferences(DIDO_DATA, Context.MODE_PRIVATE).edit()
                            .remove(DO2_ENABLED)
                            .apply()
                    null
                }
                else -> {
                    GpioDemoApplication.instance
                            .getSharedPreferences(DIDO_DATA, Context.MODE_PRIVATE).edit()
                            .putBoolean(DO2_ENABLED, value)
                            .apply()
                    value
                }
            }
        }

}
