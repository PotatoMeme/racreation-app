package com.potatomeme.recreationapp.data.model.info


import com.google.gson.annotations.SerializedName

data class InfoResponse(
    @SerializedName("currentCount")
    val currentCount: Int,//현재 결과 수
    @SerializedName("data")
    val infoData: List<InfoData>,
    @SerializedName("numOfRows")
    val numOfRows: Int,//한 페이지 결과 수
    @SerializedName("pageNo")
    val pageNo: Int,//페이지 번호
    @SerializedName("resultCode")
    val resultCode: Int,//결과코드
    @SerializedName("resultMsg")
    val resultMsg: String,//결메시지
    @SerializedName("totalCount")
    val totalCount: Int//전체 결과 수
)