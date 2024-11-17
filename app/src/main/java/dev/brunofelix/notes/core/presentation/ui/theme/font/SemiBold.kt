package dev.brunofelix.notes.core.presentation.ui.theme.font

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import dev.brunofelix.notes.R

object SemiBold {

    val body1 = TextStyle(
        fontFamily = FontFamily(Font(R.font.klee_one_semibold)),
        fontWeight = FontWeight(600),
        fontSize = 18.sp
    )
    val body2 = TextStyle(
        fontFamily = FontFamily(Font(R.font.klee_one_semibold)),
        fontWeight = FontWeight(600),
        fontSize = 16.sp
    )
    val body3 = TextStyle(
        fontFamily = FontFamily(Font(R.font.klee_one_semibold)),
        fontWeight = FontWeight(600),
        fontSize = 14.sp
    )
}