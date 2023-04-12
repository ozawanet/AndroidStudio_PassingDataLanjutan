package com.example.latihan4

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.SeekBar
import android.widget.Spinner
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





        var tvsb = findViewById<TextView>(R.id.tvsb)
        var sb =  findViewById<SeekBar>(R.id.sb)
        sb.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(SeekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                tvsb.text = progress.toString()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
            
        })

        val btnkirim = findViewById<Button>(R.id.btnkirim)
        val edNama = findViewById<EditText>(R.id.ed1)
        val edEmail = findViewById<EditText>(R.id.ed2)
        val edPass = findViewById<EditText>(R.id.ed3)
        val rbpria = findViewById<RadioButton>(R.id.rd1)
        val rbwanita = findViewById<RadioButton>(R.id.rd2)
        val sbusia = findViewById<TextView>(R.id.tvsb)
        val tvps = findViewById<Spinner>(R.id.sp)

        val pk = findViewById<TextView>(R.id.tgbt)

        btnkirim.setOnClickListener(){
            val nama = edNama.text.toString()
            val email = edEmail.text.toString()
            val pass = edPass.text.toString()

            val jk = if (rbpria.isChecked) {
                "Pria"
            } else if (rbwanita.isChecked) {
                "Wanita"
            } else {
                "Belum Dipilih"
            }

            val usia = sbusia.text.toString()
            val prodi = tvps.selectedItem.toString()
            val kelas = pk.text.toString()



            Intent(this, TargetActivity::class.java).also {
                it.putExtra("Extra_Nama",nama)
                it.putExtra("Extra_Email",email)
                it.putExtra("Extra_Pass",pass)
                it.putExtra("Extra_jk",jk)
                it.putExtra("Extra_Usia",usia)
                it.putExtra("Extra_Prodi",prodi)
                it.putExtra("Extra_Kelas",kelas)
                startActivity(it)
            }
        }


        val btnbundle = findViewById<Button>(R.id.btnbundle)

        btnbundle.setOnClickListener(){
            val nama = edNama.text.toString()
            val email = edEmail.text.toString()
            val pass = edPass.text.toString()

            val jk = if (rbpria.isChecked) {
                "Pria"
            } else if (rbwanita.isChecked) {
                "Wanita"
            } else {
                "Belum Dipilih"
            }

            val usia = sbusia.text.toString()
            val prodi = tvps.selectedItem.toString()
            val kelas = pk.text.toString()

            val bundle = Bundle()
            bundle.putString("Bundle_Nama",nama)
            bundle.putString("Bundle_Email",email)
            bundle.putString("Bundle_Pass",pass)
            bundle.putString("Bundle_jk",jk)
            bundle.putString("Bundle_Usia",usia)
            bundle.putString("Bundle_Prodi",prodi)
            bundle.putString("Bundle_Kelas",kelas)

            val intent = Intent(this, TargetActivity2::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }


    }
}