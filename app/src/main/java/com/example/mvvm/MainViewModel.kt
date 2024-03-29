package com.example.mvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * MainViewModel checks for data changes
 */

class MainViewModel : ViewModel () {

    private var mRepository = PersonRepository()

    private var mTextWelcome = MutableLiveData<String>()
    var textWelcome = mTextWelcome

    private var mLogin = MutableLiveData<Boolean>()
    var login = mLogin

    init {
        mTextWelcome.value = "Hello World!"
    }


    fun login(login : String){
        val ret = mRepository.login(login)
        mLogin.value = ret

    }


}