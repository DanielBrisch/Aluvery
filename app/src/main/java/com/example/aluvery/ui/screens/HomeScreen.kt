package com.example.aluvery.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.aluvery.R
import com.example.aluvery.model.Product
import com.example.aluvery.ui.components.ProductsSection
import java.math.BigDecimal

val sampeProducts = listOf(
    Product(
        name = "Hamburguer",
        price = BigDecimal("17.99"),
        image = R.drawable.fritas,
    ),

    Product(
        name = "Pizza",
        price = BigDecimal("10.99"),
        image = R.drawable.fritas,

        ),
    Product(
        name = "Fritas",
        price = BigDecimal("7.99"),
        image = R.drawable.fritas,

        ),

    )

@Composable
fun HomeScreen() {
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(
                rememberScrollState()
            ),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Spacer(Modifier)
        ProductsSection("Promoções", sampeProducts)
        ProductsSection("Salgados", sampeProducts)
        ProductsSection("Doces", sampeProducts)
        Spacer(Modifier)
    }
}