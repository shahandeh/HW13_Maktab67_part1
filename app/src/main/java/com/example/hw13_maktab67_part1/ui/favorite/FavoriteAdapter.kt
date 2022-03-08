package com.example.hw13_maktab67_part1.ui.favorite

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.hw13_maktab67_part1.R
import com.example.hw13_maktab67_part1.repository.Movie
import com.example.hw13_maktab67_part1.util.glide

class FavoriteAdapter(private val listOfFavorite : MutableList<Movie>) : RecyclerView.Adapter<FavoriteAdapter.FavoriteViewHolder>() {

    class FavoriteViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView){
        private val movieImage: ImageView = itemView.findViewById(R.id.movieImageView)
        private val movieTitle: TextView = itemView.findViewById(R.id.movieName)
        private val movieLike: ImageView = itemView.findViewById(R.id.movieLike)
        fun bind(movie: Movie){
            movieImage.glide(movie.imageUrl)
            movieTitle.text = movie.name
            movieLike.setImageResource(R.drawable.like)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoriteViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.favorite_ui_item_sample, parent, false)
        return FavoriteViewHolder(view)
    }

    override fun onBindViewHolder(holder: FavoriteViewHolder, position: Int) {
        holder.bind(listOfFavorite[position])
    }

    override fun getItemCount(): Int {
        return listOfFavorite.size
    }

}