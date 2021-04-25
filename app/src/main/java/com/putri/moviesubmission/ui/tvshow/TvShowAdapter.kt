package com.putri.moviesubmission.ui.tvshow

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

class TvShowAdapter : RecyclerView.Adapter<TvShowAdapter.MediaViewHolder>() {
    private var listShows = ArrayList<MediaEntity>()

    fun setShows(shows: List<MediaEntity>) {
        if (shows.isNullOrEmpty()) return
        this.listShows.clear()
        this.listShows.addAll(shows)
    }

    class MediaViewHolder(private val binding: ItemsListBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(shows: MediaEntity) {
            with(binding) {
                Glide.with(itemView.context)
                    .load(shows.poster)
                    .apply(RequestOptions().override(80,120))
                    .transform(RoundedCorners(15))
                    .into(mediaPoster)

                itemTitle.text = shows.title
                itemGenre.text = shows.genre

                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailActivity::class.java)
                    intent.putExtra(DetailActivity.EXTRA_DATA, shows.mediaId)
                    intent.putExtra(DetailActivity.EXTRA_TYPE, "tvShow")
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
        val movie = listShows[position]
        holder.bind(movie)
    }

    override fun getItemCount(): Int = listShows.size
}