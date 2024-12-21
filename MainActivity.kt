package com.example.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigation.ui.theme.NavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController();
            NavigationTheme {
                Scaffold(modifier = Modifier.fillMaxSize(),
                    bottomBar = {
                        BottomAppBar (
                            content = {
                                IconButton (
                                    onClick = {navController.navigate("home")},
                                    content = {
                                        Icon(Icons.Filled.Home, contentDescription ="home")
                                    }
                                )
                                IconButton (
                                    onClick = {navController.navigate("search")},
                                    content = {
                                        Icon(Icons.Filled.Search, contentDescription ="search")
                                    }
                                )
                                IconButton (
                                    onClick = {navController.navigate("user")},
                                    content = {
                                        Icon(Icons.Filled.Person, contentDescription ="user")
                                    }
                                )
                                IconButton (
                                    onClick = {navController.navigate("setting")},
                                    content = {
                                        Icon(Icons.Filled.Settings, contentDescription ="setting")
                                    }
                                )
                            }
                        )
                    }
                ) { innerPadding ->
                    NavHost(
                        navController = navController,
                        startDestination = "home",
                        Modifier.padding(innerPadding)
                    ) {
                        composable(route = "home") { HomeScreen() }
                        composable(route = "search") { SearchScreen() }
                        composable(route = "user") { UserScreen() }
                        composable(route = "setting") { SettingScreen() }

                    }

                }
            }
        }
    }
}

@Composable
fun HomeScreen () {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize(),
        content = {
            Text(text = "Home Screen")
        }
    )
}

@Composable
fun SearchScreen () {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize(),
        content = {
            Text(text = "Search Screen")
        }
    )
}

@Composable
fun UserScreen () {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize(),
        content = {
            Text(text = "User Screen")
        }
    )
}

@Composable
fun SettingScreen () {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize(),
        content = {
            Text(text = "Setting Screen")
        }
    )
}

