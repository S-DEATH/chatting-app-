package com.project.pradyotprakash.flashchat.nav

import androidx.navigation.NavHostController

object Destination {
    const val AuthenticationOption = "authenticationOption"
    const val Register = "register"
    const val Login = "login"
    const val Home = "home"
}

class Action(private val navController: NavHostController) {
    val home: () -> Unit = {
        navController.navigate(Destination.Home) {
            popUpTo(Destination.Login) {
                inclusive = true
            }
            popUpTo(Destination.Register) {
                inclusive = true
            }
        }
    }
    val login: () -> Unit = { navController.navigate(Destination.Login) }
    val register: () -> Unit = { navController.navigate(Destination.Register) }
    val navigateBack: () -> Unit = { navController.popBackStack() }
}
