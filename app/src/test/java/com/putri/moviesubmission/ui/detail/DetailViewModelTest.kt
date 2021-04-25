package com.putri.moviesubmission.ui.detail

import com.putri.moviesubmission.utils.DataMedia
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DetailViewModelTest {

    private lateinit var viewModel: DetailViewModel

    private val dataMovie = DataMedia.setDataMovie()[0]
    private val movieId = dataMovie.mediaId

    private val dataShow = DataMedia.setDataShow()[0]
    private val showId = dataShow.mediaId

    @Before
    fun setup() {
        viewModel = DetailViewModel()
        viewModel.setSelectedMovie(movieId)
        viewModel.setSelectedTvShow(showId)
    }

    @Test
    fun getMovieDetail() {
        viewModel.setSelectedMovie(dataMovie.mediaId)
        val movie = viewModel.getMovieDetail()
        assertNotNull(movie)
        assertEquals(dataMovie.mediaId, movie.mediaId)
        assertEquals(dataMovie.poster, movie.poster)
        assertEquals(dataMovie.title, movie.title)
        assertEquals(dataMovie.genre, movie.genre)
        assertEquals(dataMovie.duration, movie.duration)
        assertEquals(dataMovie.overview, movie.overview)
        assertEquals(dataMovie.cast, movie.cast)
    }

    @Test
    fun getShowDetail() {
        viewModel.setSelectedTvShow(dataShow.mediaId)
        val tvShow = viewModel.getShowDetail()
        assertNotNull(tvShow)
        assertEquals(dataShow.mediaId, tvShow.mediaId)
        assertEquals(dataShow.poster, tvShow.poster)
        assertEquals(dataShow.title, tvShow.title)
        assertEquals(dataShow.genre, tvShow.genre)
        assertEquals(dataShow.duration, tvShow.duration)
        assertEquals(dataShow.overview, tvShow.overview)
        assertEquals(dataShow.cast, tvShow.cast)
    }
}