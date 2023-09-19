package com.example.esti2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.esti2.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val usernames = intent.getStringExtra(MainActivity.username)
        val emails = intent.getStringExtra(MainActivity.email)
        val phones = intent.getStringExtra(MainActivity.phone)

        with(binding){
            teks1.text = "Welcome $usernames !!"
            teks2.text = "Your email : $emails"
            teks3.text = "Your phone number : $phones"
        }

    }
}