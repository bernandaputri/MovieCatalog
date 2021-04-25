package com.putri.moviesubmission.ui.main

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.putri.moviesubmission.R
import com.putri.moviesubmission.utils.DataMedia
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    private val dataMovie = DataMedia.setDataMovie()
    private val dataTvShow = DataMedia.setDataShow()

    @get:Rule
    var activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun loadMovie() {
        onView(withId(R.id.rv_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dataMovie.size))
    }

    @Test
    fun loadMovieDetail() {
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.img_media)).check(matches(isDisplayed()))
        onView(withId(R.id.collapse_toolbar)).check(matches(isDisplayed()))
        onView(withId(R.id.collapse_toolbar)).check(matches(withContentDescription(dataMovie[0].title)))
        onView(withId(R.id.btn_save)).check(matches(isDisplayed()))
        onView(withId(R.id.btn_save)).perform(click())
        onView(withId(R.id.btn_share_media)).check(matches(isDisplayed()))
        onView(withId(R.id.btn_share_media)).perform(click())
        onView(withId(R.id.btn_save)).check(matches(isDisplayed()))
        onView(withId(R.id.btn_save)).perform(click())
        onView(withId(R.id.tv_detail)).check(matches(withText("${dataMovie[0].genre} | ${dataMovie[0].duration}")))
        onView(withId(R.id.tv_overview)).check(matches(withText(dataMovie[0].overview)))
        onView(withId(R.id.tv_cast)).check(matches(withText(dataMovie[0].cast)))
    }

    @Test
    fun loadTvShow() {
        onView(withText("TV SHOW")).perform(click())
        onView(withId(R.id.rv_tv_show)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_tv_show)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dataTvShow.size))
    }

    @Test
    fun loadTvShowDetail() {
        onView(withText("TV SHOW")).perform(click())
        onView(withId(R.id.rv_tv_show)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.img_media)).check(matches(isDisplayed()))
        onView(withId(R.id.collapse_toolbar)).check(matches(isDisplayed()))
        onView(withId(R.id.collapse_toolbar)).check(matches(withContentDescription(dataTvShow[0].title)))
        onView(withId(R.id.btn_save)).check(matches(isDisplayed()))
        onView(withId(R.id.btn_save)).perform(click())
        onView(withId(R.id.btn_share_media)).check(matches(isDisplayed()))
        onView(withId(R.id.btn_share_media)).perform(click())
        onView(withId(R.id.btn_save)).check(matches(isDisplayed()))
        onView(withId(R.id.btn_save)).perform(click())
        onView(withId(R.id.tv_detail)).check(matches(withText("${dataTvShow[0].genre} | ${dataTvShow[0].duration}")))
        onView(withId(R.id.tv_overview)).check(matches(withText(dataTvShow[0].overview)))
        onView(withId(R.id.tv_cast)).check(matches(withText(dataTvShow[0].cast)))
    }

}