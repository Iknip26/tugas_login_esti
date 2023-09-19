package com.example.esti2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.esti2.databinding.ActivityMain2Binding
import com.example.esti2.databinding.ActivityThirdBinding


class ThirdActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
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