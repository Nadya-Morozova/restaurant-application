package com.example.restaurantapplication.screens.mainscreen.data

import android.net.Uri

data class UserGoogle(
    val personName: String? = null,
    val personGivenName: String? = null,
    val personFamilyName: String? = null,
    val personEmail: String? = null,
    val personId: String? = null,
    val personPhoto: Uri? = null
)
