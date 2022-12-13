package com.example.restaurantapplication.screens.activities.registration

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.restaurantapplication.db.data.User
import com.example.restaurantapplication.db.repository.ProductDbRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RegistrationViewModel @Inject constructor(
    private val productDbRepository: ProductDbRepository,
    @ApplicationContext private val context: Context
) : ViewModel() {

    val email = MutableLiveData<String>()
    val password = MutableLiveData<String>()

    val isUserAdded = MutableLiveData<Boolean>()

    private val userList = MutableLiveData<List<User>>()

    fun getAllListOfUsers() {
        viewModelScope.launch {
            userList.value = productDbRepository.getUsersEmail()
        }
    }

    fun createAccount() {
        if (email.value.isNullOrBlank()) {
            Toast.makeText(context, "Field email cannot be empty", Toast.LENGTH_SHORT).show()
            isUserAdded.value = false
            return
        }

        if (password.value.isNullOrBlank()) {
            Toast.makeText(context, "Field password cannot be empty", Toast.LENGTH_SHORT).show()
            isUserAdded.value = false
            return
        }

        if (userList.value?.contains(User(email.value)) == true) {
            Toast.makeText(context, "This user exist!", Toast.LENGTH_SHORT).show()
            isUserAdded.value = false
            return
        }

        viewModelScope.launch {
            productDbRepository.registerUser(User(email.value, password.value))
            isUserAdded.value = true
        }
    }

}