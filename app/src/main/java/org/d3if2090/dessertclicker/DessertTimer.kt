package org.d3if2090.dessertclicker

import android.os.Looper
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import java.util.logging.Handler

var secondsCount = 0
private var handler = Handler(Looper.getMainLooper())
private lateinit var runnable: Runnable
fun startTimer() {
    runnable = Runnable {
        secondsCount++
        Timber.i("Timer is at : $secondsCount")
        handler.postDelayed(runnable, 1000)
    }
    handler.postDelayed(runnable, 1000)
}
fun stopTimer() {
    handler.removeCallbacks(runnable)
}
}
class DessertTimer(lifecycle: Lifecycle) : LifecycleObserver {
    init{
        lifecycle.addObserver(this)
    }
}
