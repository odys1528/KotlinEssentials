@file:JvmName("StaticCar")

package academy.learnprogramming.interoperability

import java.io.IOException


fun topLevel() = println("nana")

fun main(args: Array<String>) {
    "nana kotlin".print()
}

@JvmOverloads
fun defaultArgs(num: Int = 25) {}

fun String.print() = println(this)

object Singleton {
    @JvmStatic fun doSomething() = println("singleton object")
}

@Throws(IOException::class)
fun doIO() {
    throw IOException()
}

class Car(color: String, @JvmField val model: String, val year: Int, val isAutomatic: Boolean) {
    var color: String = color
    set(value) {
        field = "always black"
    }

    companion object {
        const val constant = 25  // annotation isn't needed
        @JvmField val nana = false
        @JvmStatic fun carComp() = println("car companion object")
    }

    fun printMe(text: String) = println("nana: $text")

}