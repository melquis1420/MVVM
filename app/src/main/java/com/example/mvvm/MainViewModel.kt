package com.example.mvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * MainViewModel trás as alterações de dados
 */

class MainViewModel : ViewModel () {

    private var mTextWelcome = MutableLiveData<String>()
    var textWelcome = mTextWelcome

    init {
        mTextWelcome.value = "Hello World!"
    }


}