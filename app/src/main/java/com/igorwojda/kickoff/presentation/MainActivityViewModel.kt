package com.igorwojda.kickoff.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.igorwojda.kickoff.data.Repository
import kotlinx.coroutines.launch

class MainActivityViewModel:ViewModel() {

    private val repository = Repository()
    private val mutableLiveData = MutableLiveData<List<String>>()
    val LiveData = mutableLiveData as LiveData<List<String>>

    init {
        viewModelScope.launch {
            val result = repository.listBorn()
            mutableLiveData.postValue(result)
        }
    }
}