package com.willyramad.chaptertigatopiclima

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_main)

    val lisContact = arrayListOf(
        MyContact("Willy", "234567890", R.drawable.dua),
        MyContact("ana", "234567890", R.drawable.dua),
        MyContact("bili", "234567890", R.drawable.dua),
        MyContact("budi", "234567890", R.drawable.dua),
        MyContact("santy", "234567890", R.drawable.dua),
        MyContact("bobi", "234567890", R.drawable.dua),
        MyContact("sity", "234567890", R.drawable.dua),
        MyContact("meymey", "234567890", R.drawable.dua),
        MyContact("icha", "234567890", R.drawable.dua),
        MyContact("sambo", "234567890", R.drawable.dua),
        MyContact("putri", "234567890", R.drawable.dua),
        MyContact("putra", "234567890", R.drawable.dua),

    )
    val adapter = ContactAdapter(lisContact)

    val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)

        recyclerView.layoutManager = layoutManager

        recyclerView.adapter = adapter
    }

}