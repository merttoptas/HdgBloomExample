package com.merttoptas.hdgbloomexample.navigation

import com.merttoptas.hdgbloomexample.R

/**
 * Created by merttoptas on 11.09.2022.
 */

enum class BottomNav(val route: String, val icon: Int, val screenName: String) {
    HOME(NavScreen.HomeScreen.route,
        R.drawable.ic_baseline_home_24,
        "Home"),
    FAVORITES(
        NavScreen.FavoritesScreen.route,
        R.drawable.ic_baseline_favorite_border_24,
        "Favorites",
    ),
    PROFILE(
        NavScreen.ProfileScreen.route,
        R.drawable.ic_baseline_account_circle_24,
        "Profile",
    ),
    CART(
        NavScreen.CartScreen.route,
        R.drawable.ic_baseline_shopping_cart_24,
        "Cart"
    ),
}