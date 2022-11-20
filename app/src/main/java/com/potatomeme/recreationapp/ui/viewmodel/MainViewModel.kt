package com.potatomeme.recreationapp.ui.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.potatomeme.recreationapp.data.model.flag.FlagResponse
import com.potatomeme.recreationapp.data.repository.FlagRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(
    private val flagRepository: FlagRepository,
) : ViewModel() {
    private val _flagResult = MutableLiveData<FlagResponse>()
    val flagResult: LiveData<FlagResponse> get() = _flagResult

    fun searchFlagWithName(name: String) = viewModelScope.launch(Dispatchers.IO) {
        val response = flagRepository.searchFlagWithName(name)
        if (response.isSuccessful) {
            response.body()?.let { body ->
                _flagResult.postValue(body)
            }
        }else{
            Log.d(TAG, "searchFlagWithName: response.isNotSuccessful")
            Log.d(TAG, response.message())
        }
    }

    fun searchFlagWithISO(iso: String) = viewModelScope.launch(Dispatchers.IO) {
        val response = flagRepository.searchFlagWithISO(iso)
        if (response.isSuccessful) {
            response.body()?.let { body ->
                _flagResult.postValue(body)
            }
        }else{
            Log.d(TAG, "searchFlagWithISO: response.isNotSuccessful")
            Log.d(TAG, response.message())
        }
    }

    fun searchFlagWithNum(num: Int) = viewModelScope.launch(Dispatchers.IO) {
        val response = flagRepository.searchFlagWithNum(num)
        if (response.isSuccessful) {
            response.body()?.let { body ->
                _flagResult.postValue(body)
            }
        }else{
            Log.d(TAG, "searchFlagWithNum: response.isNotSuccessful")
            Log.d(TAG, response.message())
        }
    }

    companion object{
        private const val TAG = "MainViewModel"
    }
}