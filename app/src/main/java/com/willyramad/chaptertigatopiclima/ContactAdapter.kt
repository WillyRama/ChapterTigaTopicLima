package com.willyramad.chaptertigatopiclima
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ListAdapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter(val lisContact :ArrayList<MyContact>) : RecyclerView.Adapter<ContactAdapter.ViewHolder>(){
    // untuk mengambil id dari layout
    class ViewHolder (view: View ) : RecyclerView.ViewHolder(view){
        val nama = view.findViewById<TextView>(R.id.tvnama)
        val nim = view.findViewById<TextView>(R.id.tvnomor)
        val gambar = view.findViewById<ImageView>(R.id.imgorang)
    }

//  buat object viewholder, untuk register dan inflate layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactAdapter.ViewHolder {
    val view = LayoutInflater.from(parent.context).inflate(R.layout.my_contact_item,parent, false)
    return ViewHolder(view)
    }

// untuk set data ke layout
    override fun onBindViewHolder(holder: ContactAdapter.ViewHolder, position: Int) {
    holder.nama.text = lisContact[position].nama
    holder.nim.text = lisContact[position].nomor
    holder.gambar.setImageResource(lisContact[position].img)
    }

// jumlah item yang muncul di recyclerview
    override fun getItemCount(): Int {
        return lisContact.size
    }

}