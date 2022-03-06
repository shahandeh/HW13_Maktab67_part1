package com.example.hw13_maktab67_part1.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.hw13_maktab67_part1.R
import com.example.hw13_maktab67_part1.delet.Movie
import com.example.hw13_maktab67_part1.util.glide

class HomeAdapter(private val movieList: MutableList<Movie>) : RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {

    class HomeViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        private val movieImage: ImageView = itemView.findViewById(R.id.movieImageView)
        private val movieTitle: TextView = itemView.findViewById(R.id.movieName)
        private val movieLike: ImageView = itemView.findViewById(R.id.movieLike)
        fun setMovie(movie: Movie){
            movieImage.glide(movie.imageUrl)
            movieTitle.text = movie.name
            movieLike.setImageResource(R.drawable.favorite)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.home_ui_item_sample, parent,false)
        return HomeViewHolder(view)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        holder.setMovie(movieList[position])
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

}