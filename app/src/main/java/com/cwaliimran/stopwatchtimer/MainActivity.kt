package com.cwaliimran.stopwatchtimer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cwaliimran.stopwatchtimer.databinding.ActivityMainBinding
import com.stopwatch.Stopwatch
import com.stopwatch.buildStopwatch

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val TAG = MainActivity::class.java.simpleName

    //define
    private lateinit var stopwatch: Stopwatch

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //initialize stopwatch timer
        buildStopWatch()
        clicks()

    }

    private fun clicks() {
        binding.btnStart.setOnClickListener {
            stopwatch.start()
        }
        binding.btnStop.setOnClickListener {
            //no need to check null it does automatically in class
            stopwatch.stop()
        }
        binding.btnReset.setOnClickListener {
            stopwatch.reset()
            binding.textViewTimer.text = getString(R.string.default_time)
        }
    }

    private fun buildStopWatch() {
        stopwatch = buildStopwatch {
            startFormat("MM:SS:LL")
            /*  changeFormatWhen(5, TimeUnit.SECONDS, "5s -> MM:SS:LL")
              changeFormatWhen(10, TimeUnit.SECONDS, "10s -> MM:SS:LL")
              changeFormatWhen(15, TimeUnit.SECONDS, "15s -> MM:SS:LL")
              changeFormatWhen(20, TimeUnit.SECONDS, "20s -> MM:SS:LL")
              actionWhen(5, TimeUnit.SECONDS) { showToast("5s passed") }
              actionWhen(10, TimeUnit.SECONDS) { showToast("10s passed") }
              actionWhen(20, TimeUnit.SECONDS) { showToast("20s passed") }*/
            onTick { millis, formattedTime ->
                binding.textViewTimer.text = formattedTime
            }
        }
    }
}