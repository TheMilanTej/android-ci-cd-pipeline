package com.milantejani.cd_cd_pipeline_android

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.milantejani.cd_cd_pipeline_android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val appVersion = "${BuildConfig.VERSION_CODE} || ${BuildConfig.VERSION_NAME}"
        binding.txtAppVersion.text=String.format(getString(R.string.app_version), appVersion)
    }
}