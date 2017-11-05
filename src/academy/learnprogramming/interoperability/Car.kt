@file:JvmName("StaticCar")

package academy.learnprogramming.interoperability

fun topLevel() = println("nana")

fun main(args: Array<String>) {
    "nana kotlin".print()
}

class Car(color: String, @JvmField val model: String, val year: Int, val isAutomatic: Boolean) {
    var color: String = color
    set(value) {
        field = "always black"
    }
}

fun String.print() = println(this)