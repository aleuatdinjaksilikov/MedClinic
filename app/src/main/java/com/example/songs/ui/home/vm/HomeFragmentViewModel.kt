package com.example.songs.ui.home.vm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.songs.data.models.ResultData
import com.example.songs.domain.usecase.getSongs.GetSongsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class HomeFragmentViewModel @Inject constructor(private val getSongsUseCase: GetSongsUseCase) :
    ViewModel() {

    private val _getSongsFlow = MutableSharedFlow<List<SongData>?>()
    val getSongsFlow: SharedFlow<List<SongData>?> get() = _getSongsFlow

    private val _messageGetSongsFlow = MutableSharedFlow<String>()
    val messageGetSongsFlow: SharedFlow<String> get() = _messageGetSongsFlow

    private val _errorGetSongsFlow = MutableSharedFlow<Throwable>()
    val errorGetSongsFlow: SharedFlow<Throwable> get() = _errorGetSongsFlow

    fun getSongs() {
        getSongsUseCase.execute().onEach {
            when(it){
                is ResultData.Success->{
                    _getSongsFlow.emit(it.data)
                }
                is ResultData.Message->{
                    _messageGetSongsFlow.emit(it.message)
                }
                is ResultData.Error->{
                    _errorGetSongsFlow.emit(it.error)
                }
            }
        }.launchIn(viewModelScope)
    }
}