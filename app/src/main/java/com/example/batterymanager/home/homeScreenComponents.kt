package com.example.batterymanager.home // ktlint-disable filename

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.batterymanager.R
import com.example.batterymanager.ui.theme.BatteryManagerTheme

// ktlint-disable filename
@Preview(showBackground = true)
@Composable
fun PageHeaderText() {
    Text(
        text = stringResource(R.string.header),
        fontSize = 25.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Black,
    )
}

@Composable
fun PercentageCharacter(name: Int) {
    Text(text = "$name%", fontSize = 30.sp, color = Color.White)
}

@Preview(showBackground = false)
@Composable
fun PreviewPercentage() {
    BatteryManagerTheme {
        PercentageCharacter(name = 50)
    }
}

@Composable
fun BatteryInfoText(name: String) {
    Text(text = "$name", fontSize = 15.sp)
}

@Composable
fun BatteryIcons(imageVector: Painter) {
    Icon(
        painter = imageVector,
        contentDescription = null,
        modifier = Modifier.size(75.dp),
    )
}

@Composable
fun TechnologyInfo() {
    Row {
        BatteryIcons(painterResource(R.drawable.technology))
        Column {
            BatteryInfoText(name = "Technology")
            BatteryInfoText(name = "Li-ion")
//
        }
    }
}

@Composable
fun VoltageInfo() {
    Row {
        BatteryIcons(painterResource(R.drawable.bolt))
        Column {
            BatteryInfoText(name = "Voltage")
            BatteryInfoText(name = "5V")
        }
    }
}

@Composable
fun TemperatureInfo() {
    Row {
        BatteryIcons(painterResource(R.drawable.thermometer))
        Column {
            BatteryInfoText(name = "Temperature")
            BatteryInfoText(name = "25°C")
        }
    }
}

@Composable
fun PluginInfo() {
    Row {
        BatteryIcons(painterResource(R.drawable.plugin))
        Column {
            BatteryInfoText(name = "Plugin State")
            BatteryInfoText(name = "Plug in")
        }
    }
}

@Composable
fun BatteryInfoSubTitleText(name: String) {
    Text(text = "$name", fontSize = 25.sp)
}

@Preview(showBackground = true)
@Composable
fun BatteryInfoCard() {
    Card(
        modifier = Modifier
            .padding(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.Black,
            contentColor = Color.White,
        ),
        elevation = CardDefaults.cardElevation(10.dp),
        shape = RoundedCornerShape(20.dp),
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            BatteryInfoSubTitleText(name = "Battery Status")
            Spacer(modifier = Modifier.padding(10.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                VoltageInfo()
                Spacer(modifier = Modifier.width(25.dp))
                TemperatureInfo()
            }
            Spacer(modifier = Modifier.padding(10.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                TechnologyInfo()
                Spacer(modifier = Modifier.width(5.dp))
                PluginInfo()
            }
        }
    }
}
