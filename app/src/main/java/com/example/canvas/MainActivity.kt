package com.example.canvas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    lateinit var customDrawing:CustomDrawing
    lateinit var customViewFan: CustomViewFan
    lateinit var customViewDrawing: CustomViewDrawing

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        customDrawing=CustomDrawing(this)
//        setContentView(customDrawing)

//        customViewFan=CustomViewFan(this)
//        setContentView(customViewFan)

        customViewDrawing=CustomViewDrawing(this)
        setContentView(customViewDrawing)
    }
}