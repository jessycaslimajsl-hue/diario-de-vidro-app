package com.diariodevidro.app
import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
 override fun onCreate(s: Bundle?) {
  super.onCreate(s)
  val w = WebView(this)
  w.settings.javaScriptEnabled = true
  w.settings.domStorageEnabled = true
  w.loadUrl("file:///android_asset/index.html")
  setContentView(w)
 }
}
