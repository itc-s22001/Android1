package jp.ac.it_college.std.s22001.lifecyclesample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import jp.ac.it_college.std.s22001.lifecyclesample.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySubBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("LifeCycleSample", "Sub onCreate() called.")
        super.onCreate(savedInstanceState)
        binding = ActivitySubBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btPrevious.setOnClickListener(::onPrevious)
    }

    override fun onStart() {
        Log.i("LifeCycleSample", "Sub onCreate() called.")
        super.onStart()
    }

    override fun onRestart() {
        Log.i("LifeCycleSample", "Sub onCreate() called.")
        super.onRestart()
    }

    override fun onResume() {
        Log.i("LifeCycleSample", "Sub onCreate() called.")
        super.onResume()
    }

    override fun onPause() {
        Log.i("LifeCycleSample", "Sub onCreate() called.")
        super.onPause()
    }

    override fun onStop() {
        Log.i("LifeCycleSample", "Sub onCreate() called.")
        super.onStop()
    }

    override fun onDestroy() {
        Log.i("LifeCycleSample", "Sub onCreate() called.")
        super.onDestroy()
    }

    private fun onPrevious(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}