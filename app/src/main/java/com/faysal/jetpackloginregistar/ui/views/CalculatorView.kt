package com.faysal.jetpackloginregistar.ui.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.faysal.jetpackloginregistar.ui.theme.*

/**
 * Created by fsfaysalcse on 27/4/22.
 * Email : fsfoysal15@gmail.com
 */

@Composable
fun InputOutputViews(
    historyPainter: Painter,
    clearPainter: Painter,
) {
    Text(
        text = "130+50",
        modifier = Modifier.fillMaxWidth(),
        style = Typography.h4,
        color = White,
        textAlign = TextAlign.Right,
        fontWeight = FontWeight.Normal
    )

    Spacer(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
    )

    Text(
        text = "180",
        modifier = Modifier.fillMaxWidth(),
        style = Typography.h5,
        color = Yellow,
        textAlign = TextAlign.Right,
        fontWeight = FontWeight.Normal
    )

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(5.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        IconButton(
            content = {
                Image(
                    painter = historyPainter,
                    contentDescription = "History",
                    colorFilter = ColorFilter.tint(White),
                    modifier = Modifier.size(24.dp)
                )
            },
            onClick = {

            }
        )
        IconButton(
            content = {
                Image(
                    painter = clearPainter,
                    contentDescription = "Clear",
                    colorFilter = ColorFilter.tint(Yellow),
                    modifier = Modifier.size(24.dp)
                )
            },
            onClick = {

            }
        )
    }
}

@Composable
fun CalculationViews() {

    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        FunctionalButton(color = YellowDark, text = "C", fontSize = 30.sp) {

        }
        FunctionalButton(text = "()", fontSize = 30.sp) {

        }
        FunctionalButton(text = "%", fontSize = 30.sp) {

        }
        FunctionalButton(text = "÷") {

        }
    }
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        KeywardButton(color = White, text = "7") {

        }
        KeywardButton(color = White, text = "8") {

        }
        KeywardButton(color = White, text = "9") {

        }
        FunctionalButton(text = "×") {

        }
    }
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        KeywardButton(color = White, text = "4") {

        }
        KeywardButton(color = White, text = "5") {

        }
        KeywardButton(color = White, text = "6") {

        }
        FunctionalButton(text = "−") {

        }
    }
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        KeywardButton(color = White, text = "1") {

        }
        KeywardButton(color = White, text = "2") {

        }
        KeywardButton(color = White, text = "3") {

        }
        FunctionalButton(text = "+") {

        }
    }
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        KeywardButton(color = White, text = "+/-") {

        }
        KeywardButton(color = White, text = "0") {

        }
        KeywardButton(color = White, text = ".") {

        }
        FunctionalButton(color = White,text = "=", background = Yellow) {

        }
    }
}


@Composable
fun KeywardButton(
    color: Color,
    text: String,
    action: () -> Unit
) {

    Box(
        modifier = Modifier
            .size(80.dp)
            .background(
                color = IconBG,
                shape = CircleShape
            )
            .clickable { action() },
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = text,
            color = color,
            fontWeight = FontWeight.SemiBold,
            fontFamily = Montserrat,
            fontSize = 30.sp
        )
    }

}

@Composable
fun FunctionalButton(
    color: Color = FunctionText,
    text: String,
    fontSize : TextUnit = 50.sp,
    background : Color = FunctionBtnBG,
    action: () -> Unit
) {

    Box(
        modifier = Modifier
            .size(80.dp)
            .background(
                color = background,
                shape = CircleShape
            )
            .clickable { action() },
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = text,
            color = color,
            fontWeight = FontWeight.Normal,
            fontFamily = Montserrat,
            fontSize = fontSize
        )
    }

}