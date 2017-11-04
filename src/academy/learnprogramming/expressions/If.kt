package academy.learnprogramming.expressions


fun main(args: Array<String>) {

    val condition = true
    val num = if (condition) 50 else 1

    val x = if (condition) {  // must be both if and else blocks
        println("if")
        0  // returning value
    } else {
        println("else")
        1  // returning value
    }
    // the whole expression can be assigned, printed etc
}