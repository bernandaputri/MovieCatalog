package com.putri.moviesubmission.ui.tvshow

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class TvShowViewModelTest {

    private lateinit var viewModel: TvShowViewModel

    @Before
    fun setup() {
        viewModel = TvShowViewModel()
    }

    @Test
    fun getShows() {
        val showEntities = viewModel.getShows()
        assertNotNull(showEntities)
        assertEquals(10, showEntities.size)
    }
}