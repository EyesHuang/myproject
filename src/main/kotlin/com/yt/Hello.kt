package com.yt

fun main(args: Array<String>) {
//    println("Hello World")
//    Human().hello()
    val h = Human()
    h.hello()

    var a: Double
    var b: Float
    var c: Int
    var d: Short
    var e: Long
    var f: Boolean
    var g: Byte
    var i: Char
    var j: String

}

class Human {
    var a: Double = 0.0
    var b: Float = 0.0f
    val c: Int = 1


    fun hello() {
        println("Hello Kotlin");
    }
}