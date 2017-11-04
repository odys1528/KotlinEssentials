package academy.learnprogramming.lambda_collections_generics


fun main(args: Array<String>) {

    val setInts = setOf(10, 15, -22, 3)  // immutable
    setInts.plus(20)  // adding an element, doesn't change the set
    setInts.plus(2)  // no duplicates
    setInts.minus(2)
    setInts.average()
    setInts.drop(2)  // drop first 2 elements

    val mutableInts = mutableSetOf(1, 2, 3, 4, 5)
    mutableInts.plus(10)  // doesn't change the set

    println(setInts.filter { it % 2 != 1 })

    val newList = setInts.map { it + 10 }



}