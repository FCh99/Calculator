package com.example.excel2

import java.text.DecimalFormat

class Helper {
}


class Cell (
    var name: String = "",
    var value: Double = 0.0


)


fun formattedDoubleToString(value: Double): String {
    return String.format("%.2f", value)
}