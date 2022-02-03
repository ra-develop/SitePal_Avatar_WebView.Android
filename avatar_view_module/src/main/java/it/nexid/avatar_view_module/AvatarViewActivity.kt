package it.nexid.avatar_view_module

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import it.nexid.avatar_view_module.databinding.ActivityAvatarViewBinding

class AvatarViewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAvatarViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAvatarViewBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        webViewSetup()
    }


    private fun webViewSetup(){

        binding.avatarWebView.loadUrl("file:///android_asset/page.html")

        val webSettings = binding.avatarWebView.settings
        webSettings.javaScriptEnabled = true

        binding.avatarWebView.webViewClient = WebViewClient()

        binding.avatarWebView.canGoBack()
    }

    override fun onBackPressed() {
        if (binding.avatarWebView.canGoBack()) binding.avatarWebView.goBack() else super.onBackPressed()
    }


}