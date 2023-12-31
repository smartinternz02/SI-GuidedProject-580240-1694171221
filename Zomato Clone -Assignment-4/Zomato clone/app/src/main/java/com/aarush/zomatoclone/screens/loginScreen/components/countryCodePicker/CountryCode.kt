package com.aarush.zomatoclone.screens.loginScreen.components.countryCodePicker

import com.aarush.zomatoclone.R
import java.util.Locale

data class CountryData(
    private var cCodes: String,
    val countryPhoneCode: String = "+91",
    val cNames: String = "in",
    val flagResID: Int = R.drawable.`in`
) {
    val countryCode = cCodes.lowercase(Locale.getDefault())
}
