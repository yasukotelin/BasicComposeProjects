package com.github.yasukotelin

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountBox
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class User(
    val logo: ImageVector,
    val name: String,
    val title: String,
    val phoneNumber: String,
    val mailAddress: String,
)

@Composable
fun MainScreen(
    modifier: Modifier = Modifier,
    user: User = User(
        logo = Icons.Rounded.AccountBox,
        name = "Telin.",
        title = "Android Engineer",
        phoneNumber = "1234-5678-9000",
        mailAddress = "telin@example.com"
    )
) {
    Scaffold(modifier = modifier.fillMaxSize()) { innerPadding ->
        Box(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    contentAlignment = Alignment.Center
                ) {
                    UserNameSection(user = user, modifier = Modifier.fillMaxWidth())
                }

                UserAddressSection(
                    user = user,
                    modifier = Modifier.padding(bottom = 50.dp)
                )
            }
        }
    }
}

@Composable
fun UserNameSection(
    modifier: Modifier = Modifier,
    user: User
) {
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            imageVector = user.logo,
            contentDescription = "user logo",
            modifier = Modifier.size(68.dp)
        )

        Text(
            text = user.name,
            fontSize = 58.sp,
            fontWeight = FontWeight.Medium
        )

        Text(
            text = user.title,
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal,
            color = Color.DarkGray
        )
    }
}

@Composable
fun UserAddressSection(
    user: User,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier, horizontalAlignment = Alignment.Start) {
        ContactRow(
            icon = Icons.Rounded.Phone,
            text = user.phoneNumber
        )
        Spacer(modifier = Modifier.height(8.dp))
        ContactRow(
            icon = Icons.Rounded.Email,
            text = user.mailAddress
        )
    }
}

@Composable
fun ContactRow(
    icon: ImageVector,
    text: String,
    modifier: Modifier = Modifier
) {
    Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
        Icon(
            imageVector = icon,
            tint = Color.DarkGray,
            contentDescription = null,
            modifier = Modifier.size(24.dp) // サイズを固定
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = text, fontSize = 16.sp, color = Color.DarkGray)
    }
}

@Composable
@Preview
fun MainScreenPreview() {
    MaterialTheme {
        MainScreen()
    }
}