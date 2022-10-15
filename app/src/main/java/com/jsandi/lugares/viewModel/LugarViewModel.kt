package com.jsandi.lugares.viewModel

import android.app.Application
import androidx.lifecycle.*
import com.jsandi.lugares.data.LugarDatabase
import com.jsandi.lugares.model.Lugar
import com.jsandi.lugares.repository.LugarRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class LugarViewModel(application: Application) : AndroidViewModel(application) {

    val getAllData: LiveData<List<Lugar>>

    private val repository: LugarRepository

    init {
        val lugarDao = LugarDatabase.getDatabase(application).lugarDao()
        repository = LugarRepository(lugarDao)
        getAllData = repository.getAllData
    }

    fun addLugar (lugar: Lugar){
        viewModelScope.launch(Dispatchers.IO) { repository.addLugar(lugar) }
    }

    fun updateLugar (lugar: Lugar){
        viewModelScope.launch(Dispatchers.IO) { repository.updateLugar(lugar) }
    }

    fun deleteLugar (lugar: Lugar){
        viewModelScope.launch(Dispatchers.IO) { repository.deleteLugar(lugar) }
    }
}