package ru.netology.nmedia.activity

import kotlin.math.floor

fun toKString(value: Int): String {
    val k = value / 1000.0
    if (k in 1.0..<10.0) {
        var s = (floor(k * 10) / 10).toString()
        s = s.dropLastWhile { it == '0' }.dropLastWhile { it == '.' }
        return "${s}K"
    }  else if(k >= 10) {
        return "${(value / 1000)}K"
    } else {
        return value.toString()
    }
}