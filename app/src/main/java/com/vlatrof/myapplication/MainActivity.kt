package com.vlatrof.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.vlatrof.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.sampleText.text = stringFromJNI()
    }

    private external fun stringFromJNI(): String

    companion object {
        init {
            System.loadLibrary("myapplication")
        }
    }
}
