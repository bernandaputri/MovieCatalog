package com.putri.moviesubmission.ui.detail

import androidx.lifecycle.ViewModel
import com.putri.moviesubmission.data.MediaEntity
import com.putri.moviesubmission.utils.DataMedia

class DetailViewModel : ViewModel() {

    private lateinit var movieId: String
    private lateinit var tvShowId: String

    fun setSelectedMovie(movieId: String) {
        this.movieId = movieId
    }

    fun getMovieDetail(): MediaEntity {
        lateinit var movies: MediaEntity
        val movieEntities = DataMedia.setDataMovie()
        for (movie in movieEntities) {
            if (movie.mediaId == movieId) {
                movies = movie
            }
        }
        return movies
    }

    fun setSelectedTvShow(tvShowId: String) {
        this.tvShowId = tvShowId
    }

    fun getShowDetail() : MediaEntity {
        lateinit var tvShows: MediaEntity
        val showEntities = DataMedia.setDataShow()
        for (show in showEntities) {
            if (show.mediaId == tvShowId) {
                tvShows = show
            }
        }
        return tvShows
    }
}