package com.putri.moviesubmission.ui.movie

import androidx.lifecycle.ViewModel
import com.putri.moviesubmission.data.MediaEntity
import com.putri.moviesubmission.utils.DataMedia

class MovieViewModel : ViewModel() {
    fun getMovies(): List<MediaEntity> = DataMedia.setDataMovie()
}