package com.example.ballcatchingboxview

import android.view.View
import android.view.MotionEvent
import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Canvas

val colors : Array<Int> = arrayOf(
    "#b71c1c",
    "#1A237E",
    "#006064",
    "#BF360C",
    "#00C853"
).map {
    Color.parseColor(it)
}.toTypedArray()
val backColor : Int = Color.parseColor("#BDBDBD")
val rFactor : Float = 7.8f
val lineHFactor : Float = 5.9f
val lineWFactor : Float = 6.8f
val strokeFactor : Float = 90f
val parts : Int = 5
val scGap : Float = 0.02f / parts
val delay : Long = 20
