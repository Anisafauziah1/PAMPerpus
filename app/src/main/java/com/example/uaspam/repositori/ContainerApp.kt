package com.example.uaspam.repositori

import android.content.Context
import com.example.uaspam.data.DatabaseSewa

interface ContainerApp{
    val repositoriSewa : RepositoriSewa
}
class ContainerDataApp(private val context: Context): ContainerApp{
    override val repositoriSewa: RepositoriSewa by lazy {
        OfflineRepositoriSewa(DatabaseSewa.getDatabase(context).sewaDao())
    }
}