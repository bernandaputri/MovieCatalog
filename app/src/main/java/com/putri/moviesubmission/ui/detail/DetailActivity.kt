package com.putri.moviesubmission.ui.detail

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.putri.moviesubmission.R
import com.putri.moviesubmission.data.MediaEntity
import com.putri.moviesubmission.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        const val EXTRA_DATA = "extra_data"
        const val EXTRA_TYPE = "extra_type"
    }

    private lateinit var binding: ActivityDetailBinding
    private lateinit var result: MediaEntity
    private var isAdd = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.toolbar.setNavigationOnClickListener { onBackPressed() }

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[DetailViewModel::class.java]

        val mediaId = intent.getStringExtra(EXTRA_DATA)

        when (intent.getStringExtra(EXTRA_TYPE)) {
            "movie" -> {
                mediaId?.let { viewModel.setSelectedMovie(it) }
                result = viewModel.getMovieDetail()
            }
            "tvShow" -> {
                mediaId?.let { viewModel.setSelectedTvShow(it) }
                result = viewModel.getShowDetail()
            }
        }

        with(binding) {
            collapseToolbar.title = result.title

            Glide.with(this@DetailActivity)
                .load(result.poster)
                .into(imgMedia)

            tvDetail.text = StringBuilder("${result.genre} | ${result.duration}")
            tvOverview.text = result.overview
            tvCast.text = result.cast
        }

        binding.btnSave.setOnClickListener(this)
        binding.btnShareMedia.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_save -> {
                if (isAdd) {
                    binding.btnSave.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_add,0,0,0)
                    binding.btnSave.setText(R.string.add_to_watchlist)
                    Toast.makeText(this, getString(R.string.btn_added), Toast.LENGTH_SHORT).show()
                    isAdd = false
                } else {
                    binding.btnSave.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_check,0,0,0)
                    binding.btnSave.setText(R.string.added_to_watchlist)
                    Toast.makeText(this, getString(R.string.btn_add), Toast.LENGTH_SHORT).show()
                    isAdd = true
                }
            }
            R.id.btn_share_media -> {
                Toast.makeText(this, getString(R.string.btn_share), Toast.LENGTH_SHORT).show()
            }
        }
    }
}