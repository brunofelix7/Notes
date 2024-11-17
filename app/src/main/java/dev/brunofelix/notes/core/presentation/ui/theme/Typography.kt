package dev.brunofelix.notes.core.presentation.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import dev.brunofelix.notes.R
import dev.brunofelix.notes.core.presentation.ui.theme.font.Regular
import dev.brunofelix.notes.core.presentation.ui.theme.font.SemiBold

object Typography {

    val regular: Regular
        @Composable
        @ReadOnlyComposable
        get() = Regular

    val semiBold: SemiBold
        @Composable
        @ReadOnlyComposable
        get() = SemiBold
}