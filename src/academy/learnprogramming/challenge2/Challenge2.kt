package academy.learnprogramming.challenge2

fun main(args: Array<String>) {

    // Declare a non-nullable float variable two ways, and assign it the value -3847.384.
    val float1 = -3847.384f
    val float2 = (-3847.384).toFloat()

    // Now change both of those variable declarations into nullable variables.
    val float11: Float? = -3847.384f
    val float22: Float? = (-3847.384).toFloat()

    // Now declare an array of type non-nullable Short. Make it size and assign it the values 1, 2, 3, 4, and 5.
    val shortArray = shortArrayOf(1, 2, 3, 4, 5)
    val shortArray2: Array<Short> = arrayOf(1, 2, 3, 4, 5)

    // Now declare an array of type nullable Ints and initialize it with the values 5-200 with step=5.
    val intArray = Array<Int?>(40) { i -> (i + 1) * 5 }

    // You have to call a Java method with the following signature from Kotlin:
    // public void method1(char[] charArray). Declare an array that you could pass to the method and initialize it with
    // the values 'a', 'b', and 'c'.
    val charArray = charArrayOf('a', 'b', 'c')


    // Given the following code:
    val x1: String? = null
    // Using one line of code, declare another String variable, and assign it x.toLowerCase() when x isn't null,
    // and the string "I give up" when x is null
    val z = x1?.toLowerCase() ?: "I give up"

    // Now use the let function to lowercase the string, and then replace "am" with "am not" in the result.
    val x2: String? = "I AM IN UPPERCASE"
    x2?.let { it.toLowerCase().replace("am", "am not") }

    // You're really, really confident that the variable myNonNullVariable can't contain null. Change the following code
    // to assert that myNonNullVariable isn't null.
    val myNonNullVariable: Int? = null
    myNonNullVariable!!.toDouble()

}