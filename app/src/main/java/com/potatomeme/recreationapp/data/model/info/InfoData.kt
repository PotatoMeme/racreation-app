package com.potatomeme.recreationapp.data.model.info


import com.google.gson.annotations.SerializedName

data class InfoData(
    @SerializedName("climate_cn")
    val climateCn: String,//기후 내용
    @SerializedName("country_area")
    val countryArea: String,//국가 면적
    @SerializedName("country_area_comment")
    val countryAreaComment: String,//국가 면적 설명
    @SerializedName("country_area_src")
    val countryAreaSrc: String,//국가 면적 출처
    @SerializedName("country_cptl_nm")
    val countryCptlNm: String,//국가 수도명
    @SerializedName("country_eng_nm")
    val countryEngNm: String,//영문 국가명
    @SerializedName("country_iso_alp2")
    val countryIsoAlp2: String,//ISO 2자리코드
    @SerializedName("country_lc")
    val countryLc: String,//국가 위치
    @SerializedName("country_nm")
    val countryNm: String,//국가 수도명
    @SerializedName("lang_cn")
    val langCn: Any,//언어내용
    @SerializedName("lang_nm")
    val langNm: Any,//언어명
    @SerializedName("main_city_cn")
    val mainCityCn: String,//주요도시내용
    @SerializedName("main_ethnic_cn")
    val mainEthnicCn: String,//주요민족내용
    @SerializedName("mscmctn_cn")
    val mscmctnCn: String,//주요언론내용
    @SerializedName("religion_cn")
    val religionCn: String,//종교내용
    @SerializedName("written_year")
    val writtenYear: Int//작성년도
)