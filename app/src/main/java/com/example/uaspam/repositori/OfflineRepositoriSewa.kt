package com.example.uaspam.repositori

import com.example.uaspam.data.Sewa
import com.example.uaspam.data.SewaDao
import kotlinx.coroutines.flow.Flow

class OfflineRepositoriSewa(private val sewaDao: SewaDao): RepositoriSewa {
    override fun getAllSewaStream(): Flow<List<Sewa>> =sewaDao.getAllSewa()

    override fun getSewaStream(id: Int): Flow<Sewa?> =sewaDao.getSewa(id)

    override suspend fun insertSewa(sewa: Sewa) =sewaDao.insert(sewa)

    override suspend fun deleteSewa(sewa: Sewa) = sewaDao.delete(sewa)

    override suspend fun updateSewa(sewa: Sewa) = sewaDao.update(sewa)
}