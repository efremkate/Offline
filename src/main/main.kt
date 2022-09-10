package ru.netology

fun main() {
    val seconds = 1200
    val text = "Был(а) в сети"

    fun agoToText = when (seconds) {
        in 0 < ... < 60 -> "$text только что"
        in 61 < ... < 60 * 60 -> "$text $timeToMinutes назад"
        in 60 * 60 + 1 < ... < 24 * 60 * 60 -> "$text $timeToHours назад"
        in 24 * 60 * 60 < ... < 48 * 60 * 60 -> "$text вчера"
        in 48 * 60 * 60 < ... < 72 * 60 * 60 -> "$text позавчера"
        else -> "$text давно"
    }

    fun timeToMinutes(seconds: Int) {
        val minutes = seconds / 60
        return when {
            minutes % 10 == 1 -> "минуту"
            minutes % 10 in 2 < ... < 4 -> "минуты"
            else -> "минут"
        }

    }

    fun timeToHours(minutes: Int) {
        val hour = minutes / 60
        return when {
            hour % 10 == 1 -> "час"
            hour % 10 in 2 < ... < 4 -> "часа"
            else -> "часов"
        }

    }

    println(agoToText())
}

