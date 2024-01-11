package com.example.uaspam.repositori

import com.example.uaspam.data.Sewa
import kotlinx.coroutines.flow.Flow

interface RepositoriSewa {
    fun getAllSewaStream(): Flow<List<Sewa>>

    fun getSewaStream(id: Int): Flow<Sewa?>
}