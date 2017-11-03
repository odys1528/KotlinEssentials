package academy.learnprogramming.loops_if_when_try_catch


fun main(args: Array<String>) {

    // when ~ switch
    val num = 16

    val result = when (num) {
        100 -> println(100)  // braces for more operations
        200, 300 -> println(250)  // or
        in 1..10 -> print("1-5")  // range
        4*4 -> print(16)  // statement
        else -> println("other")  // if we use all values of enum, 'else' unnecessary
    }

    when {
        num < 10 -> println("<10")
        else -> println(">=10")
    }

}