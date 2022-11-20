package com.potatomeme.recreationapp.data.api

import com.potatomeme.recreationapp.data.model.info.InfoResponse
import com.potatomeme.recreationapp.util.Constants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface InfoApi {
    @GET("/1262000/CountryGnrlInfoService2/getCountryGnrlInfoList2")
    suspend fun searchInfoWithName(
        @Query("cond[country_nm::EQ]") name: String,
        @Query("serviceKey") serviceKey: String = Constants.INFO_KEY,
        @Query("returnType") returnType: String = "JSON",
    ): Response<InfoResponse>

    @GET("/1262000/CountryGnrlInfoService2/getCountryGnrlInfoList2")
    suspend fun searchInfoWithISO(
        @Query("cond[country_iso_alp2::EQ]") iso: String,
        @Query("serviceKey") serviceKey: String = Constants.INFO_KEY,
        @Query("returnType") returnType: String = "JSON",
    ): Response<InfoResponse>

    @GET("/1262000/CountryGnrlInfoService2/getCountryGnrlInfoList2")
    suspend fun searchInfoWithNum(
        @Query("pageNo") pageNo: Int,
        @Query("serviceKey") serviceKey: String = Constants.INFO_KEY,
        @Query("returnType") returnType: String = "JSON",
        @Query("numOfRows") row: Int = 1,
    ): Response<InfoResponse>
}