package com.diariodevidro.app
import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import android.view.Gravity

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val t = TextView(this)
        t.text = "Funcionou!"
        t.textSize = 30f
        t.gravity = Gravity.CENTER
        setContentView(t)
    }
}
