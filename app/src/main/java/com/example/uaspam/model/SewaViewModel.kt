package com.example.uaspam.model

import androidx.lifecycle.ViewModel
import com.example.uaspam.repositori.RepositoriSewa

class SewaViewModel(private val repositoriSewa: RepositoriSewa): ViewModel() {
    companion object {
        private const val TIMEOUT_MILLIS = 5_000L
    }

    