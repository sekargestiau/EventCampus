package com.simple.eventcampus.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.simple.eventcampus.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ApiClient.create .getNews .enqueue object : Callback NewsResponse{
            override fun onResponse call: Call NewsResponse , response: Response NewsResponse(){
                Log.d tag: "MainActivity".response.body().tostring()
        }
            override fun onFailure call: Call NewsResponse , t: Throwable(){

        }
        }
    }
}