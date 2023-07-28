package com.example.hiltcompose.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.hiltcompose.domian.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(
    val repository: MyRepository
) : ViewModel() {

    init {
        Log.d("TAGALOG", ": Created ViewModel")
    }

}