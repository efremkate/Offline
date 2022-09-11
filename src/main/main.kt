package ru.netology

fun main() {
    val seconds = 2400
    val text = "Был(а) в сети"
    println(agoToText(seconds, text))
}

fun agoToText(seconds: Int, text: String) = when (seconds) {
    in 0..60 -> "$text только что"
    in 61..60 * 60 -> "$text ${timeToMinutes(seconds)} назад"
    in 60 * 60 + 1..24 * 60 * 60 -> "$text ${timeToHours(seconds)} назад"
    in 24 * 60 * 60..48 * 60 * 60 -> "$text вчера"
    in 48 * 60 * 60..72 * 60 * 60 -> "$text позавчера"
    else -> "$text давно"
}

fun timeToMinutes(seconds: Int): String {
    val minutes = seconds / 60
    return when {
        minutes % 10 == 1 -> "минуту"
        minutes % 10 in 2..4 -> "$minutes минуты"
        minutes in 11..14 -> "$minutes минут"
        else -> "$minutes минут"
    }
}

fun timeToHours(minutes: Int): String {
    val hour = minutes / 60
    return when {
        hour % 10 == 1 -> "час"
        hour % 10 in 2..4 -> "$hour часа"
        else -> "$hour часов"
    }
}
