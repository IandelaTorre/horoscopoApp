package com.example.horoscoapp.ui.detail

import com.example.horoscoapp.domain.model.HoroscopeModel

sealed class HoroscopeDetailState {
    data object Loading:HoroscopeDetailState()
    data class Error(val error:String):HoroscopeDetailState()
    data class Success(val prediction:String, val title: String, val horoscopeModel: HoroscopeModel):HoroscopeDetailState()
}