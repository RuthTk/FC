package com.example.medicare

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splashscreen)

        //used to hide the status bar and make the splashscreen a full screen activity

        /*window.setFlags(
            windowManager.LayoutParams.FLAG_FULLSCREEN,
            windowManager.LayoutParams.FLAG_FULLSCREEN
        )*/
        Handler().postDelayed({
            val intent = Intent(this@SplashScreenActivity, locationActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000) // 3000 is the delayed time in milliseconds.
    }
}