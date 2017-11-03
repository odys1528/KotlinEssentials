package academy.learnprogramming.challenges.challenge1

fun main(args: Array<String>) {

    // Declare two immutable String variables called hallo1 and hello2.
    // Assign "Hello" to both variables.
    val hello1 = "Hello"
    val hello2 = "Hello"

    // Using one line of code, test whether hello1 and hello2 are referentially equal and print the result
    println("hello1 === hello2: ${hello1 === hello2}")

    // Do the same thing as above, but test for structural equality
    println("hello1 == hello2: ${hello1 == hello2}")

    // Declare a mutable variable of type Int and assign it the value of 2988
    var n = 2988

    // Declare an immutable variable of type and assign it the string "The Any type is the root of the Kotlin class
    // hierarchy". Then, using a smart cast, print out uppercased string."
    val a: Any
    a = "The Any type is the root of the Kotlin class hierarchy"
    if(a is String) {
        println(a.toUpperCase())
    }

    // Using one line of code, print out the following. Make sure your code is nicely indented.
    //     1
    //    11
    //   111
    //  1111
    println("""     1
        |    11
        |   111
        |  1111
    """.trimMargin())

}