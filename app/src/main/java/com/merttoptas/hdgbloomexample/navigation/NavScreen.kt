package com.merttoptas.hdgbloomexample.navigation

/**
 * Created by merttoptas on 11.09.2022.
 */
sealed class NavScreen(val route :String) {
    object WelcomeScreen : NavScreen("welcome_screen")
    object HomeScreen : NavScreen("home_screen")
    object FavoritesScreen : NavScreen("favorites_screen")
    object ProfileScreen : NavScreen("profile_screen")
    object CartScreen : NavScreen("cart_screen")
}