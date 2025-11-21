package com.example.myarsitekturmvvm.viewmodel

import androidx.lifecycle.ViewModel
import com.example.myarsitekturmvvm.model.Siswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class SiswaViemModel : ViewModel() {
        private val _statusUI = MutableStateFlow(Siswa())
        val statusUI: StateFlow<Siswa> = _statusUI.asStateFlow()
    }

