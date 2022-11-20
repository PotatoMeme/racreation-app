package com.potatomeme.recreationapp.data.repository

import com.potatomeme.recreationapp.data.api.RetrofitInstance
import com.potatomeme.recreationapp.data.model.flag.FlagResponse
import retrofit2.Response

class FlagRepositoryImpl : FlagRepository {
    override suspend fun searchFlagWithName(name: String): Response<FlagResponse> {
        return RetrofitInstance.flagApi.searchFlagWithName(name)
    }

    override suspend fun searchFlagWithISO(iso: String): Response<FlagResponse> {
        return RetrofitInstance.flagApi.searchFlagWithISO(iso)
    }

    override suspend fun searchFlagWithNum(num: Int): Response<FlagResponse> {
        return RetrofitInstance.flagApi.searchFlagWithNum(num)
    }
}