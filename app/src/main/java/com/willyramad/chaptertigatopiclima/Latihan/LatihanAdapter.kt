package com.willyramad.chaptertigatopiclima.Latihan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.willyramad.chaptertigatopiclima.R

class LatihanAdapter (val lisRumah :ArrayList<DataRumah>): RecyclerView.Adapter<LatihanAdapter.ViewHolder>(){
    class ViewHolder (view: View) : RecyclerView.ViewHolder(view){
        val gambar = itemView.findViewById<ImageView>(R.id.imgrumah)
        val provinsi = itemView.findViewById<TextView>(R.id.txtprovinsi)
        val kabupaten = itemView.findViewById<TextView>(R.id.txtkabupaten)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LatihanAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rumahadat,parent ,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: LatihanAdapter.ViewHolder, position: Int) {
        holder.gambar.setImageResource(lisRumah[position].img)
        holder.provinsi.text = lisRumah[position].provinsi
        holder.kabupaten.text = lisRumah[position].kabupaten
    }

    override fun getItemCount(): Int {
        return lisRumah.size
    }
}