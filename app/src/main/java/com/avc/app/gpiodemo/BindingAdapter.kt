package com.avc.app.gpiodemo

import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("displayTime")
fun bindDisplayTime(textView: TextView, time: Int) {
    textView.text = GpioDemoApplication.instance.getString(R.string.do_display_time, time)
}