package util

fun getString(message: String): String {
    println(message)
    return readLine()!!
}