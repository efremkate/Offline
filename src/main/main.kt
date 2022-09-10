package ru.netology

fun main() {
    val seconds = 1200
    val text = "Был(а) в сети"

    var agoToText = when (seconds) {
        in 0 < ... < 60 -> "только что"
        in 61 < ... < 60 * 60 -> "x минут назад"
        in 60 * 60 + 1 < ... < 24 * 60 * 60 -> "x часов назад"
        in 24 * 60 * 60 < ... < 48 * 60 * 60 -> "вчера"
        in 48 * 60 * 60 < ... < 72 * 60 * 60 -> "позавчера"
        in 72 * 60 * 60 < ... -> "давно"
    }
}

