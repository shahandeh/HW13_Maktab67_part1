package com.example.hw13_maktab67_part1.ui.comingsoon

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.hw13_maktab67_part1.R
import com.example.hw13_maktab67_part1.repository.ComingSoonMovie
import com.example.hw13_maktab67_part1.util.glide

class ComingSoonMovieAdapter(
    private val listOfComingSoonMovie : List<ComingSoonMovie>,
    private val share: Share
    ) : RecyclerView.Adapter<ComingSoonMovieAdapter.ComingSoonMovieViewHolder>(){

    inner class ComingSoonMovieViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView), View.OnClickListener{
        override fun onClick(p0: View?) {
            share.shareMovie(adapterPosition)
        }
        init {
            itemView.setOnClickListener(this)
        }

        private val movieImage: ImageView = itemView.findViewById(R.id.imageView)
        private val movieTitle: TextView = itemView.findViewById(R.id.title)
        private val movieUrl: TextView = itemView.findViewById(R.id.url)
        fun bind(comingSoonMovie: ComingSoonMovie){
            movieImage.glide(comingSoonMovie.url)
            movieTitle.text = comingSoonMovie.name
            movieUrl.text = comingSoonMovie.url
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComingSoonMovieViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.comingsoon_ui_item_sample, parent, false)
        return ComingSoonMovieViewHolder(view)
    }

    override fun onBindViewHolder(holder: ComingSoonMovieViewHolder, position: Int) {
        holder.bind(listOfComingSoonMovie[position])
    }

    override fun getItemCount(): Int {
        return listOfComingSoonMovie.size
    }

}

interface Share{
    fun shareMovie(position : Int)
}