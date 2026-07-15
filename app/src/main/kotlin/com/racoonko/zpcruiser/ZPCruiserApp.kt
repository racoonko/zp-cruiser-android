package com.racoonko.zpcruiser

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun ZPCruiserApp() {
    val navController = rememberNavController()
    
    NavHost(navController = navController, startDestination = "today") {
        composable("today") { TodayScreen() }
        composable("map") { MapScreen() }
    }
}