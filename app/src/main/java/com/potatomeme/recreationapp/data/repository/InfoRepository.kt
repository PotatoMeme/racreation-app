package com.potatomeme.recreationapp.data.repository

import com.potatomeme.recreationapp.data.model.flag.FlagResponse
import com.potatomeme.recreationapp.data.model.info.InfoResponse
import retrofit2.Response

interface InfoRepository {
    suspend fun searchInfoWithName(name: String): Response<InfoResponse>

    suspend fun searchInfoWithISO(iso: String): Response<InfoResponse>

    suspend fun searchInfoWithNum(num: Int): Response<InfoResponse>
}