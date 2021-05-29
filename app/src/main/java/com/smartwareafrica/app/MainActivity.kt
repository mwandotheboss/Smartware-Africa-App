package com.smartwareafrica.app

import android.annotation.SuppressLint
import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.google.android.material.appbar.MaterialToolbar
import java.util.*

class MainActivity : AppCompatActivity() {

    private var webView: WebView? = null
    var websiteURL = "https://smartwareafrica.com"
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView = findViewById(R.id.ppWebView)
        webView!!.webViewClient = WebViewClient()
        webView!!.settings.javaScriptEnabled = true
        webView!!.settings.domStorageEnabled = true
        webView!!.overScrollMode = WebView.OVER_SCROLL_NEVER
        webView!!.loadUrl(websiteURL)
    }
}