package com.example.canvas

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class CustomDrawing(context: Context?):View(context) {
    lateinit var p:Paint
    lateinit var c:Paint
    init {
        init()
    }
    private fun init(){
        p= Paint()
        c=Paint()
    }

    override fun onDraw(canvas: Canvas) {
        canvas.drawColor(Color.BLUE)
        p.color=Color.YELLOW
        c.color=Color.BLACK
        canvas.drawRect(100f,100f,500f,500f,p)
        canvas.drawArc(500f,500f,800f,800f,0f,120f,true,p)
        canvas.drawCircle(300f,300f,90f,c)
    }
}