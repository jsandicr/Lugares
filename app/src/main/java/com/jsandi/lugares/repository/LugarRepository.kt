package com.jsandi.lugares.repository

import androidx.lifecycle.LiveData
import com.jsandi.lugares.data.LugarDao
import com.jsandi.lugares.model.Lugar

class LugarRepository(private val lugarDao: LugarDao) {

    val getAllData: LiveData<List<Lugar>> = lugarDao.getAllData()

    suspend fun addLugar(lugar: Lugar){
        lugarDao.addLugar(lugar)
    }

    suspend fun updateLugar(lugar: Lugar){
        lugarDao.updateLugar(lugar)
    }

    suspend fun deleteLugar(lugar: Lugar){
        lugarDao.deleteLugar(lugar)
    }
}