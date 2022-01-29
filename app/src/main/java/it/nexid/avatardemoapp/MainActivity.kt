package it.nexid.avatardemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import it.nexid.avatardemoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        webViewSetup()
    }

    private fun webViewSetup(){

        binding.myWebView.loadUrl("file:///android_asset/page.html")

        val webSettings = binding.myWebView.settings
        webSettings.javaScriptEnabled = true

        binding.myWebView.webViewClient = WebViewClient()

        binding.myWebView.canGoBack()
    }

    override fun onBackPressed() {
        if (binding.myWebView.canGoBack()) binding.myWebView.goBack() else super.onBackPressed()
    }
}