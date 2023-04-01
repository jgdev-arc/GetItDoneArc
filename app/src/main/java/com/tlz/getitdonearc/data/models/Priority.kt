package com.tlz.getitdonearc.data.models

import androidx.compose.ui.graphics.Color
import com.tlz.getitdonearc.ui.theme.HighPriorityColor
import com.tlz.getitdonearc.ui.theme.LowPriorityColor
import com.tlz.getitdonearc.ui.theme.MediumPriorityColor
import com.tlz.getitdonearc.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}