package com.example.notificacionestoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.notificacionestoast.databinding.ActivityAfterNotificationBinding

class AfterNotification : AppCompatActivity() {
    private lateinit var binding: ActivityAfterNotificationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAfterNotificationBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}