package com.example.esti2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.esti2.databinding.ActivityMain3Binding
import com.example.esti2.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding;

    //    INI NANTI VARIABEL YANG AKAN DI PASSING KE LOGIN PAGE KALAU REGISTER BERHASIL
    companion object{
        const val username = "username"
        const val email = "email"
        const val phone = "phone"
        const val password = "password"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){

//            ini fungsi buat ngasih tau, kalau button dengan id "buttonlogin" diklil
//            dia akan ngapain, itu kalau misal error ganti aja button login jadi nama
//            id button mu

//            Itu ceritanya di kasih logic, biar dia bisa kayak halaman register
            button.setOnClickListener{
                if(titleUsername.text.toString()!="" && titleEmail.text.toString()!="" && titlePassword.text.toString()!="" && titlePhone.text.toString()!="") {

//                    nah kalau intent ini dia gunanya buat transisi dari satu page ke page lain
//                    intent yang di bawah ini, buat transisi  dari Mainactivity3 ke MainActivity
                    val intentlogin = Intent(this@MainActivity, SecondActivity::class.java)

//                    put extra ini gunanya buat passing variabel ke page yang di tuju di intent
//                    jadi nanti kita ganti dulu nilai variabel yang udah di buat tadi di companion object
//                    sama nilai dari tiap kolom input user pake idnya

                    intentlogin.putExtra(phone, titlePhone.text.toString())
                    intentlogin.putExtra(email, titleEmail.text.toString())
                    intentlogin.putExtra(username, titleUsername.text.toString())
                    intentlogin.putExtra(password, titlePassword.text.toString())

//                    terus kira start activitynya
                    startActivity(intentlogin)
                } else {
                    Toast.makeText(this@MainActivity, "Kolom tidak boleh kosong", Toast.LENGTH_SHORT).show()
                }
            }

//            ini sama kayak tadi jelasinya
            teks2.setOnClickListener{
                val intentlogin2 = Intent(this@MainActivity, SecondActivity::class.java)
                startActivity(intentlogin2)
            }
        }
    }
}