package com.rivaldo.gdscmovie.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.rivaldo.gdscmovie.R
import com.rivaldo.gdscmovie.model.Movie

class RecyclerViewAdapter : RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder>() {

    private val item = mutableListOf<Movie>()

    class RecyclerViewHolder (val view : View) : RecyclerView.ViewHolder(view) {

        fun bindItem(item:Movie) = with(view){
            val mtitle = itemView.findViewById<TextView>(R.id.txtTitle)
            val mPoster = itemView.findViewById<ImageView>(R.id.filmPoster)
            Glide
                .with(view)
                .load(item.img)
                .centerCrop()
                .into(mPoster)
            mtitle.text = item.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.content_movie, parent, false)
        return RecyclerViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.bindItem(item[position])
    }

    override fun getItemCount() = item.size

    fun updateData(newItems: MutableList<Movie>) {
        item.clear()
        item.addAll(newItems)
        notifyDataSetChanged()
    }
}