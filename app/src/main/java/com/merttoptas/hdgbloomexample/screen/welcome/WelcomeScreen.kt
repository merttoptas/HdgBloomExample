package com.merttoptas.hdgbloomexample.screen.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.merttoptas.hdgbloomexample.R

/**
 * Created by merttoptas on 11.09.2022.
 */

@Composable
fun WelcomeScreen() {
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.primary) {
        WelcomeBackground()
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                Image(
                    modifier = Modifier
                        .padding(top = 72.dp)
                        .offset(x = 88.dp)
                        .fillMaxWidth(),
                    painter = painterResource(id = R.drawable.ic_light_welcome_illos),
                    contentDescription = null,
                    contentScale = ContentScale.Inside
                )
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                contentAlignment = Alignment.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    BloomLogo()
                    BloomText()
                    LoginButton()
                    LoginTextButton()
                }
            }
        }
    }
}

@Composable
private fun WelcomeBackground() {
    Box(modifier = Modifier.fillMaxWidth()) {
        Image(
            painter = painterResource(id = R.drawable.ic_light_welcome_bg),
            contentDescription = null,
            contentScale = ContentScale.FillWidth
        )
    }
}

@Composable
private fun WelcomeIllosImage(){
    Column() {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Image(
                modifier = Modifier
                    .padding(top = 72.dp)
                    .offset(x = 88.dp)
                    .fillMaxWidth(),
                painter = painterResource(id = R.drawable.ic_light_welcome_illos),
                contentDescription = null,
                contentScale = ContentScale.Inside
            )
        }
    }
}

@Composable
private fun BloomLogo(){
    Image(
        painter = painterResource(id = R.drawable.ic_light_logo),
        contentDescription = null,
        contentScale = ContentScale.Fit
    )
}

@Composable
private fun BloomText(){
    Text(
        modifier = Modifier.padding(top = 32.dp),
        text = "Beautiful home garden solutions",
        color = MaterialTheme.colors.onBackground,
        style = MaterialTheme.typography.subtitle1
    )
 }

@Composable
private fun LoginButton(){
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 8.dp, end = 8.dp, top = 40.dp)
            .height(47.dp),
        onClick = {}, shape = RoundedCornerShape(50),
        colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.secondary)
    ) {
        Text(
            text = "Create account",
            color = MaterialTheme.colors.onSecondary,
            style = MaterialTheme.typography.button
        )
    }
}

@Composable
private fun LoginTextButton(){
    Spacer(modifier = Modifier.height(8.dp))
    TextButton(
        modifier = Modifier
            .padding(horizontal = 32.dp)
            .defaultMinSize(minHeight = 50.dp), onClick = {}) {
        Text(
            text = "Log in",
            color = MaterialTheme.colors.secondary,
            style = MaterialTheme.typography.button
        )
    }
}