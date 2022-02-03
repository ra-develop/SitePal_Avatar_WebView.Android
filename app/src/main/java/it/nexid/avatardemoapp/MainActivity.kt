package it.nexid.avatardemoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import it.nexid.avatar_view_module.AvatarViewActivity
import it.nexid.avatardemoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button1.setOnClickListener {

            Toast.makeText(this, "View Avatar clicked", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, AvatarViewActivity::class.java)
            startActivity(intent)

        }



    }
}