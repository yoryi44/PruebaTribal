package com.example.prueba.prueba.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun CategoryScreen(
    categoryViewModel: CategoryViewModel = hiltViewModel<CategoryViewModel>()
) {
    val state = categoryViewModel.state

    LazyColumn(modifier = Modifier.fillMaxSize().background(Color.LightGray.copy(alpha = 0.5f))) {
        items(state.category) { category ->
            Card(
                modifier = Modifier
                    .padding(5.dp)
                    .background(Color.White)
                    .fillMaxWidth(),
                colors = CardColors(
                    containerColor = Color.White,
                    contentColor = Color.White,
                    disabledContainerColor = Color.White,
                    disabledContentColor = Color.White
                )
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .padding(5.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        Icons.Default.Info,
                        contentDescription = "",
                        Modifier.size(80.dp),
                        tint = Color.Black
                    )
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = category,
                            modifier = Modifier.padding(horizontal = 10.dp),
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            maxLines = 2,
                        )
                    }
                }
            }
        }
    }
}