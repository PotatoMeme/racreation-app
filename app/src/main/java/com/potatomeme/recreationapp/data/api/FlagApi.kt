package com.potatomeme.recreationapp.data.api

import com.potatomeme.recreationapp.data.model.flag.FlagResponse
import com.potatomeme.recreationapp.util.Constants.FLAG_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface FlagApi {
    @GET("/1262000/CountryFlagService2/getCountryFlagList2")
    suspend fun searchFlagWithName(
        @Query("cond[country_nm::EQ]") name: String,
        @Query("serviceKey") serviceKey: String = FLAG_KEY,
        @Query("returnType") returnType: String = "JSON",
    ): Response<FlagResponse>

    @GET("/1262000/CountryFlagService2/getCountryFlagList2")
    suspend fun searchFlagWithISO(
        @Query("cond[country_iso_alp2::EQ]") iso: String,
        @Query("serviceKey") serviceKey: String = FLAG_KEY,
        @Query("returnType") returnType: String = "JSON",
    ): Response<FlagResponse>

    @GET("/1262000/CountryFlagService2/getCountryFlagList2")
    suspend fun searchFlagWithNum(
        @Query("pageNo") pageNo: Int, //1~220
        @Query("serviceKey") serviceKey: String = FLAG_KEY,
        @Query("returnType") returnType: String = "JSON",
        @Query("numOfRows") row: Int = 1,
    ): Response<FlagResponse>
}