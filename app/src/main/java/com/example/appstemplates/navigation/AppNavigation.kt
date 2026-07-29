package com.example.appstemplates.navigation

enum class Screen {
    SPLASH,
    ANIMATION_MENU,
    FORM,
}
sealed class NavigationItem(val route: String) {
    object Splash : NavigationItem(Screen.SPLASH.name)
    object AnimationMenu : NavigationItem(Screen.ANIMATION_MENU.name)
    object Form : NavigationItem(Screen.FORM.name)
}