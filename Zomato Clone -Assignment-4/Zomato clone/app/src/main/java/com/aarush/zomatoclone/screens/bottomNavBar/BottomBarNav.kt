package com.aarush.zomatoclone.screens.bottomNavBar

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.ramcosta.composedestinations.spec.DirectionDestinationSpec
import com.aarush.zomatoclone.R
import com.aarush.zomatoclone.screens.destinations.DiningScreenDestination
import com.aarush.zomatoclone.screens.destinations.HomeScreenDestination

enum class BottomBarNav(
    val direction: DirectionDestinationSpec,
    @DrawableRes val icon: Int,
    @StringRes val label: Int
) {
    Home(HomeScreenDestination, R.drawable.delivery_bottom_nav, R.string.delivery_bottom_nav),
    Dining(DiningScreenDestination, R.drawable.local_dining_bottom_nav, R.string.dining_bottom_nav)
}
