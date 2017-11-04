package academy.learnprogramming.lambda_collections_generics


fun main(args: Array<String>) {

    val strings = listOf("spring", "summer", "fall", "winter")  // immutable in Kotlin
    val emptyList = emptyList<String>()
    println(strings.javaClass)  // java.util
    println(emptyList.javaClass)  // kotlin.collections

    val notNullList = listOfNotNull("a", null, "b")  // nulls aren't added
    println(notNullList)

    val mutableList = mutableListOf(1, 2, 3)  // mutable list
    println(mutableList.javaClass)  // java.util


}