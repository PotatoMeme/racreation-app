package com.potatomeme.recreationapp.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.potatomeme.recreationapp.data.repository.FlagRepository

class MainViewModelProviderFactory(
    private val flagRepository: FlagRepository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(flagRepository) as T
        }
        throw java.lang.IllegalArgumentException("ViewModel class not found")
    }
}