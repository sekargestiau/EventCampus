package com.simple.eventcampus.ui.data.remote

interface ApiServices {
    @GET ""
    fun getNews : Call NewsResponse

}