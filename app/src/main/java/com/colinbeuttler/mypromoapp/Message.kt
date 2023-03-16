package com.colinbeuttler.mypromoapp

import android.icu.text.CaseMap.Title

data class Message(
    val contactName: String,
    val contactNumber: String,
    val displayName: String,
    val includeJunior: Boolean,
    val jobTitle: String?,
    val immediateStart: Boolean,
    val startDate: String?
) : java.io.Serializable{

    fun getFullJobDescription()= if(includeJunior) "a Junior $jobTitle" else "an $jobTitle"

    fun getAvailablity() = if(immediateStart) "immediately" else "from $startDate"
}