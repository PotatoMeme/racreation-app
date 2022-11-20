package com.potatomeme.recreationapp.data.repository

import com.potatomeme.recreationapp.data.api.RetrofitInstance
import com.potatomeme.recreationapp.data.model.flag.FlagResponse
import com.potatomeme.recreationapp.data.model.info.InfoResponse
import retrofit2.Response

class InfoRepositoryImpl :InfoRepository {
    override suspend fun searchInfoWithName(name: String): Response<InfoResponse> {
        return RetrofitInstance.infoApi.searchInfoWithName(name)
    }

    override suspend fun searchInfoWithISO(iso: String): Response<InfoResponse> {
        return RetrofitInstance.infoApi.searchInfoWithISO(iso)
    }

    override suspend fun searchInfoWithNum(num: Int): Response<InfoResponse> {
        return RetrofitInstance.infoApi.searchInfoWithNum(num)
    }

}