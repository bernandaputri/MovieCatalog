package com.putri.moviesubmission.ui.tvshow

import androidx.lifecycle.ViewModel
import com.putri.moviesubmission.data.MediaEntity
import com.putri.moviesubmission.utils.DataMedia

class TvShowViewModel : ViewModel() {
    fun getShows(): List<MediaEntity> = DataMedia.setDataShow()
}