package academy.learnprogramming.lambda_collections_generics


fun main(args: Array<String>) {

    val list = mutableListOf("kurwa Spock")
    list.add("nana")
    printCollection(list)

    val list2 = mutableListOf(1, 2, 3)
    printCollection(list2)

    list.printCollection2()

}


fun <T> printCollection(collection: List<T>) {
    collection.forEach { print("$it ") }
    println()
}


fun <T> List<T>.printCollection2() {
    this.forEach { print("$it ") }
    println()
}