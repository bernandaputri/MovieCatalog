package com.putri.moviesubmission.ui.movie

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.putri.moviesubmission.data.MediaEntity
import com.putri.moviesubmission.databinding.ItemsListBinding
import com.putri.moviesubmission.ui.detail.DetailActivity

class MovieAdapter : RecyclerView.Adapter<MovieAdapter.MediaViewHolder>() {
    private var listMovies = ArrayList<MediaEntity>()

    fun setMovies(movies: List<MediaEntity>) {
        if (movies.isNullOrEmpty()) return
        this.listMovies.clear()
        this.listMovies.addAll(movies)
    }

    class MediaViewHolder(private val binding: ItemsListBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(movies: MediaEntity) {
            with(binding) {
                Glide.with(itemView.context)
                    .load(movies.poster)
                    .apply(RequestOptions().override(80,120))
                    .transform(RoundedCorners(15))
                    .into(mediaPoster)

                itemTitle.text = movies.title
                itemGenre.text = movies.genre

                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailActivity::class.java)
                    intent.putExtra(DetailActivity.EXTRA_DATA, movies.mediaId)
                    intent.putExtra(DetailActivity.EXTRA_TYPE, "movie")
                    itemView.context.startActivity(intent)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MediaViewHolder {
        val itemsListBinding = ItemsListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MediaViewHolder(itemsListBinding)
    }

    override fun onBindViewHolder(holder: MediaViewHolder, position: Int) {
        val movie = listMovies[position]
        holder.bind(movie)
    }

    override fun getItemCount(): Int = listMovies.size
}