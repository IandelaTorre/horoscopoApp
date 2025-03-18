package com.example.horoscoapp.domain

import com.example.horoscoapp.data.network.response.PredictionResponse
import com.example.horoscoapp.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sign: String): PredictionModel?
}