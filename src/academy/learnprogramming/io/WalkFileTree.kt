package academy.learnprogramming.io

import java.io.File


fun main(args: Array<String>) {

    File(".").walkTopDown().filter { it.name.endsWith(".kt") }.forEach { println(it) }
    // onEnter, onLeave

}