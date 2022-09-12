package com.merttoptas.hdgbloomexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.merttoptas.hdgbloomexample.navigation.NavGraph
import com.merttoptas.hdgbloomexample.ui.theme.HdgBloomExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HdgBloomExampleTheme {
              NavGraph()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HdgBloomExampleTheme {
        NavGraph()
    }
}