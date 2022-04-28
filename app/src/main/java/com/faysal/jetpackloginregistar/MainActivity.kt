package com.faysal.jetpackloginregistar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import com.faysal.jetpackloginregistar.ui.theme.*
import com.faysal.jetpackloginregistar.ui.views.CalculationViews
import com.faysal.jetpackloginregistar.ui.views.InputOutputViews
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            this.window.statusBarColor = ContextCompat.getColor(this,R.color.status_bar_color)
            JetpackLoginRegistarTheme {
                // A surface container using the 'background' color from the theme
                MyScaffold()
            }
        }
    }

    @Preview
    @Composable
    private fun MyScaffold() {

        val scaffoldState: ScaffoldState = rememberScaffoldState()
        val scope: CoroutineScope = rememberCoroutineScope()

        Scaffold(
            scaffoldState = scaffoldState,
            contentColor = LayoutBG,
            modifier = Modifier.background(LayoutBG),
            content = { ScreenContent() },
        )
    }

    @Composable
    private fun ScreenContent() {
        Column(Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(LayoutBG)
                    .padding(16.dp)
                    .weight(3.5f),
                content = {
                    InputOutputViews(
                        clearPainter = painterResource(id = R.drawable.ic_backspace_black),
                        historyPainter = painterResource(id = R.drawable.ic_history)
                    )
                }
            )
           /* Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 10.dp)
                    .height(1.dp)
                    .background(IconBG)
            )*/
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(LayoutBG)
                    .padding(16.dp)
                    .weight(6.5f),
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally,
                content = { CalculationViews() }
            )
        }
    }





}
