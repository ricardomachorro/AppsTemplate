package com.example.appstemplates.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.appstemplates.modules.form.FormScreen
import com.example.appstemplates.modules.menu.MenuScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    startDestination: String = Screen.ANIMATION_MENU.name,

) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {

        composable(NavigationItem.AnimationMenu.route) {
            MenuScreen(navController)
        }

        composable(NavigationItem.Splash.route) {
            //SplashScreen(navController)
        }
        composable(NavigationItem.Form.route) {
            FormScreen()
        }
    }

}

