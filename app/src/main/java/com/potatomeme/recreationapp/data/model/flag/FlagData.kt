package com.potatomeme.recreationapp.data.model.flag


import com.google.gson.annotations.SerializedName

data class FlagData(
    @SerializedName("content_ty")
    val contentTy: Any,
    @SerializedName("country_eng_nm")
    val countryEngNm: String,//영문 국가명
    @SerializedName("country_iso_alp2")
    val countryIsoAlp2: String,//ISO 2자리코드
    @SerializedName("country_nm")
    val countryNm: String,//한글 국가명
    @SerializedName("download_url")
    val downloadUrl: String,//다운로드url
    @SerializedName("origin_file_nm")
    val originFileNm: String//원본파일명
)