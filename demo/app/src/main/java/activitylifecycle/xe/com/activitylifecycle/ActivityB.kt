package activitylifecycle.xe.com.activitylifecycle

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

/**
 * Created by 86188 on 2021/1/8.
 */
class ActivityB: AppCompatActivity() {
    val TAG: String? = "Activity"
    var activityName: String? = "ActivityB"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        Log.d(TAG,activityName + "---------onCreate")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG,activityName + "---------onRestart")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,activityName + "---------onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,activityName + "---------onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,activityName + "---------onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,activityName + "---------onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,activityName + "---------onDestroy")
    }
}