package com.example.uaspam.model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.uaspam.repositori.RepositoriSewa
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow

class SewaViewModel(private val repositoriSewa: RepositoriSewa): ViewModel() {
    companion object {
        private const val TIMEOUT_MILLIS = 5_000L
    }

    val sewaUiState : StateFlow<SewaUiState> = repositoriSewa.getAllSewaStream().filterNotNull()
        .map { SewaUiState(listSewa = it.toList()) }
        .stateIn(scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(TIMEOUT_MILLIS),
            initialValue = SewaUiState()
        )

    data class SewaUiState(
        val listSewa: List<Sewa> = listOf()
    )
}



