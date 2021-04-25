package com.putri.moviesubmission.data

data class MediaEntity(
        var mediaId: String,
        var title: String,
        var genre: String,
        var duration: String,
        var cast: String,
        var overview: String,
        var poster: Int
)