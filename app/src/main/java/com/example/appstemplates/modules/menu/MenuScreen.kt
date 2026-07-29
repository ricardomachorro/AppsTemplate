package com.example.appstemplates.modules.menu

import android.widget.Button
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.appstemplates.navigation.NavigationItem

@Composable
fun MenuScreen(navController: NavController){
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ){

            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Button(
                    modifier = Modifier.fillMaxWidth(),
                    onClick ={
                        navController.navigate(NavigationItem.Splash.route)
                    }
                ){
                    Text(
                        text="Splash Screen",
                        textAlign = TextAlign.Center)
                }

                Button(
                    modifier = Modifier.fillMaxWidth(),
                    onClick ={
                        navController.navigate(NavigationItem.AnimationMenu.route)
                    }
                ){
                    Text(
                        text="Form",
                        textAlign = TextAlign.Center)
                }
            }
        }
}