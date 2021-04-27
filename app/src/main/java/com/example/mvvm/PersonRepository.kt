package com.example.mvvm

/**
 * Check if the field "EditText" is empty
 */
class PersonRepository {
    fun login(login :String) = (login != "")
}