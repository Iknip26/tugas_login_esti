package com.example.esti2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.esti2.databinding.ActivityMainBinding
import com.example.esti2.databinding.ActivitySecondBinding


class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding;

    //    sama kayak register penjelasanya
    companion object {
        const val username = "username"
        const val email = "email"
        const val phone = "phone"
        const val password = "password"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        nah kalau ini kita buat variabel lagi, gunanya buat nerima nilai
//        dari variabel yang udah kita passing sebelumnya

//        misal usernames, itu nanti dia akan nerima nilai username dari
//        Mainactivity3 yang udah di passing sebelumnya, dan seterusnya

        val usernames = intent.getStringExtra(MainActivity.username)
        val emails = intent.getStringExtra(MainActivity.email)
        val passwords = intent.getStringExtra(MainActivity.password)
        val phones = intent.getStringExtra(MainActivity.phone)


//        terus ini sama kayak sebelumnya penjelasanya
        with(binding) {
            buttonlogin.setOnClickListener {
                if (editTextUsername.text.toString() != "" && editTextPassword.text.toString() != "") {
                    if (usernames == editTextUsername.text.toString() && passwords == editTextPassword.text.toString()) {
                        val intentLogin = Intent(this@SecondActivity, ThirdActivity::class.java)
                        intentLogin.putExtra(username, usernames)
                        intentLogin.putExtra(phone, phones)
                        intentLogin.putExtra(email, emails)
                        startActivity(intentLogin)
                    } else {
                        Toast.makeText(
                            this@SecondActivity,
                            "password salah",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                } else {
                    Toast.makeText(
                        this@SecondActivity,
                        "kolom tidak boleh kosong",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }

            teks2.setOnClickListener {
                val intentRegis = Intent(this@SecondActivity, MainActivity::class.java)
                startActivity(intentRegis)
            }
        }
    }
}