package com.example.latihan4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class TargetActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_target2)

        val tvhasil = findViewById<TextView>(R.id.tvhasil)
        val bundle = intent.extras
        val nama = bundle?.getString("Bundle_Nama")
        val email = bundle?.getString("Bundle_Email")
        val pass = bundle?.getString("Bundle_Pass")
        val jk = bundle?.getString("Bundle_jk")
        val usia = bundle?.getString("Bundle_Usia")
        val prodi = bundle?.getString("Bundle_Prodi")
        val kelas = bundle?.getString("Bundle_Kelas")

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