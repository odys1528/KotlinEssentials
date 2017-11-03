package academy.learnprogramming.loops_if_when_try_catch


fun main(args: Array<String>) {

    println(getNumber("22.5") ?: throw IllegalArgumentException("nana"))
    notImplementedYet()

}


fun getNumber(str: String): Int? {
    return try {
        Integer.parseInt(str)
    } catch(e: NumberFormatException) {
        null
    } finally {  // no value returned
        println("finally")
    }
}


fun notImplementedYet(): Nothing {
    throw NotImplementedError("todo")
}