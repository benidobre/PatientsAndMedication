package com.example.patientsandmedication

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Patient(
    val email: String,
    val first_name: String,
    val gender: String,
    val id: Int,
    val last_name: String
) : Parcelable