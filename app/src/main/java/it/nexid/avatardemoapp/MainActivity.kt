package it.nexid.avatardemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myWebView: WebView = findViewById(R.id.webview)
        myWebView.loadUrl("https://www.sitepal.com/api/examples/sayAudio.html")

        val webSettings = myWebView.settings
        webSettings.javaScriptEnabled = true

        myWebView.webViewClient = WebViewClient()

        myWebView.canGoBack()
//        setContentView(myWebView)

    }
}