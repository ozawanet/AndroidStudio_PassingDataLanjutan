package com.example.latihan4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class TargetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_target)

        val tvhasil = findViewById<TextView>(R.id.tvhasil)
        val nama = intent.getStringExtra("Extra_Nama")
        val email = intent.getStringExtra("Extra_Email")
        val pass = intent.getStringExtra("Extra_Pass")
        val jk = intent.getStringExtra("Extra_jk")
        val usia = intent.getStringExtra("Extra_Usia")
        val prodi = intent.getStringExtra("Extra_Prodi")
        val kelas = intent.getStringExtra("Extra_Kelas")

        val hasilData = "Nama anda adalah   $nama \n" +
                "Email anda                 $email \n" +
                "Password                   $pass \n" +
                "Jenis kelamin              $jk \n" +
                "Usia Anda                  $usia \n" +
                "Prodi Anda                 $prodi \n" +
                "Kelas Anda                 $kelas \n"
        tvhasil.text = hasilData

    }
}