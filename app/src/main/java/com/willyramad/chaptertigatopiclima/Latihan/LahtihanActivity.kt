package com.willyramad.chaptertigatopiclima.Latihan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.willyramad.chaptertigatopiclima.R
import kotlinx.android.synthetic.main.activity_recycler_main.*

class LahtihanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lahtihan)
        val lisRumah = arrayListOf(
            DataRumah(R.drawable.banten_rumah_baduy,"Rumah Baduy","Banten"),
            DataRumah(R.drawable.bali_gapura_candi_bentar,"Gapura candi bentar","Bali"),
            DataRumah(R.drawable.bengkulu_rumah_bubungan_lima,"rumah bubungan","bengkulu"),
            DataRumah(R.drawable.diyogyakarta_rumah_joglo,"rumah joglo","Jogja"),
            DataRumah(R.drawable.dki_jakarta_rumah_kebaya,"Rumah Baduy","Banten"),
            DataRumah(R.drawable.gorontalo_rumah_dulohupa,"Rumah dulohupa","Grontalo"),
            DataRumah(R.drawable.jambi_rumah_panggung,"Rumah panggung","jambi"),
            DataRumah(R.drawable.jwa_barat_rumah_kasepuhan,"Rumah kesepuhan","jawa barat"),
            DataRumah(R.drawable.kalimantan_tengah_rumah_betang,"Rumah betang","Kalimantan tengah"),
            DataRumah(R.drawable.kalimantan_timur_rumah_lamin,"Rumah lamin","kalimantan timur"),
        )

        val adapter = LatihanAdapter(lisRumah)

        val layoutManager = GridLayoutManager(this, 2)

        val recyclerView = findViewById<RecyclerView>(R.id.Latihanrecyclerview)

        recyclerView.layoutManager =layoutManager

        recyclerView.adapter = adapter
    }
}