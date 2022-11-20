package com.potatomeme.recreationapp.data.repository

import com.potatomeme.recreationapp.data.model.flag.FlagResponse
import retrofit2.Response

interface FlagRepository {
    suspend fun searchFlagWithName(name: String): Response<FlagResponse>

    suspend fun searchFlagWithISO(iso: String): Response<FlagResponse>

    suspend fun searchFlagWithNum(num: Int): Response<FlagResponse>
}