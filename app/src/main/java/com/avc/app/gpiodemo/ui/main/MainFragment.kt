package com.avc.app.gpiodemo.ui.main

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import android.widget.Toast
import com.avc.app.gpiodemo.GpioDemoApplication
import com.avc.app.gpiodemo.R
import com.avc.app.gpiodemo.databinding.MainFragmentBinding

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        val binding = MainFragmentBinding.inflate(inflater, container, false)
        binding.viewModel = viewModel
        binding.setLifecycleOwner(this)
        binding.do1PulseTimeBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {

            override fun onProgressChanged(seekBar: SeekBar, progress: Int, b: Boolean) {
                viewModel.changeDo1PulseTime(progress)
                viewModel.changeSeekBarDisplay(progress)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                binding.displaySeekbarTime.visibility = View.VISIBLE

            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                binding.displaySeekbarTime.visibility = View.INVISIBLE
            }
        })

        binding.do1DelayTimeBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {

            override fun onProgressChanged(seekBar: SeekBar, i: Int, b: Boolean) {
                viewModel.changeDo1DelayTime(i)
                viewModel.changeSeekBarDisplay(i)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                binding.displaySeekbarTime.visibility = View.VISIBLE

            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                binding.displaySeekbarTime.visibility = View.INVISIBLE
            }
        })

        binding.do2PulseTimeBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {

            override fun onProgressChanged(seekBar: SeekBar, i: Int, b: Boolean) {
                viewModel.changeDo2PulseTime(i)
                viewModel.changeSeekBarDisplay(i)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                binding.displaySeekbarTime.visibility = View.VISIBLE

            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                binding.displaySeekbarTime.visibility = View.INVISIBLE
            }
        })

        binding.do2DelayTimeBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {

            override fun onProgressChanged(seekBar: SeekBar, i: Int, b: Boolean) {
                viewModel.changeDo2DelayTime(i)
                viewModel.changeSeekBarDisplay(i)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                binding.displaySeekbarTime.visibility = View.VISIBLE
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                binding.displaySeekbarTime.visibility = View.INVISIBLE
            }
        })

        binding.trigger.setOnClickListener {
            Toast.makeText(GpioDemoApplication.appContext, R.string.trigger_toast, Toast.LENGTH_SHORT).show()

        }

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        // TODO: Use the ViewModel
    }

}
