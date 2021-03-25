package org.d3if2090.dessertclicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var dessertTimer: DessertTimer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.dessertButton.setOnClickListener {
            onDessertClicked()
        }
        dessertTimer = DessertTimer(this.lifecycle)

        binding.dessertButton.setImageResource(currentDessert.imageId)

        Timber.i("onCreate called")
        setContentView(R.layout.activity_main)
    }

        override fun onStart() {
            super.onStart()
            Timber.i("onStart Called")
        }

        override fun onResume() {
            super.onResume()
            Timber.i("onResume Called")
    }

         override fun onPause() {
         super.onPause()
            Timber.i("onPause Called")
    }

    override fun onStop() {
        super.onStop()
        Timber.i("onStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.i("onDestroy Called")
    }
    override fun onRestart() {
        super.onRestart()
        Timber.i("onRestart Called")
    }
    }
