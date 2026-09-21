package com.diariodevidro.app
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.view.Gravity
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val t = TextView(this)
        t.text = "Diário de Vidro\nFuncionou!"
        t.textSize = 28f
        t.gravity = Gravity.CENTER
        setContentView(t)
    }
}
