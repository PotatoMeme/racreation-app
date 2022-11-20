package com.potatomeme.recreationapp.data.model.flag


import com.google.gson.annotations.SerializedName

data class FlagResponse(
    @SerializedName("currentCount")
    val currentCount: Int,//현재 결과 수
    @SerializedName("data")
    val flagData: List<FlagData>,
    @SerializedName("numOfRows")
    val numOfRows: Int,//한 페이지 결과 수
    @SerializedName("pageNo")
    val pageNo: Int,//페이지당갯수
    @SerializedName("resultCode")
    val resultCode: Int,//결과코드
    @SerializedName("resultMsg")
    val resultMsg: String,//결과메시지
    @SerializedName("totalCount")
    val totalCount: Int,//전체 결과 수
)